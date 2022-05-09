const cont = {};

const ejemploModelo = require('../models/modeloEjemplo');

/** FUNCION obtenerEjemplos 
 * crea un ejemplo y lo guarda; y otro de muestra.
 */
cont.obtenerEjemplos = async (req, res) => {
    const ejemplos = await ejemploModelo.find();
    res.json(ejemplos);
    console.log("|Obtenido todos los objetos|");
};

/** FUNCION crearEjemplo 
 * crea un ejemplo y lo guarda; y otro de muestra.
 */
cont.crearEjemplo = ( async (req, res) => {
    const {id, titulo, contenido} = req.body;

    const eje = new ejemploModelo({
        id,
        titulo,
        contenido,
    });

    await eje.save();
    console.log("|Guardado|");
});

/** FUNCION obtenerEjemploId 
* obtiene un ejemplo por id.
*/
cont.obtenerEjemploId = ( async (req, res, err) => {
    const eje = await ejemploModelo.findById(req.params.id);
    res.json(eje);
    console.log("|Obtenido por id: " + req.params.id + " |");
});

/** FUNCION eliminarEjemploId 
* obtiene un ejemplo por id y lo elimina.
*/
cont.eliminarEjemploId = ( async (req, res, err) => {
    await ejemploModelo.findByIdAndDelete(req.params.id, req.body)
    console.log("|Elimnado en id: " + req.params.id + " |");
});

/** FUNCION actualizarEjemploId 
* obtiene un ejemplo por id y lo actualiza.
*/
cont.actualizarEjemploId = ( async (req, res, err) => {
    const {id, titulo, contenido} = req.body;

    await ejemploModelo.findByIdAndUpdate(req.params.id, {
        id,
        titulo,
        contenido,
    });

    console.log("|Actualizado en id: " + req.params.id + " |");
});

module.exports = cont;