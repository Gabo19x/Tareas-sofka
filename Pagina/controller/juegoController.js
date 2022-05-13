const cont = {};

const juegoModelo = require('../models/modeloJuego');
const jugadorModelo = require('../models/modeloJugador');

/** FUNCION crearJuego 
 * crea un juego y a 3 jugadores.
 */
cont.crearJuego = (async (req, res) => {
    const { valorId, jugadores, ganador } = req.body;

    const juego = new juegoModelo({
        id: valorId,
        jugadores: jugadores,
        ganador,
    });

    await juego.save()
        .catch(error => console.log(error));

    console.log({ valorId, jugadores, ganador });
});

/** FUNCION obtenerJuegos 
 * obtiene todos los juegos.
 */
cont.obtenerJuegos = (async (req, res) => {
    const js = await juegoModelo.find();
    res.json(js);
    console.log("|Obtenido todos los juegos|");
});

/** FUNCION obtenerJuego 
 * obtiene un juego por id.
 */
cont.obtenerJuego = (async (req, res) => {
    const j = await juegoModelo.findById(req.params.id);
    // res.json(j);
    console.log("|Obtenido juego|");
});

/** FUNCION obtenerGanador 
 * obtiene un ganador del juego
 */
cont.obtenerGanador = (async (req, res) => {
    const j = await juegoModelo.findById(req.params.id);
    const g = j.ganador;

    if (g == null) {
        res.json({ message: 'No hay ganador' })
    } else {
        // res.json(g);
    }
    console.log("|Obtenido el ganador|");
});

/** FUNCION empezarJuego 
 * asigna un numero por jugador
 */
cont.empezarJuego = (async (req, res) => {
    const j = await juegoModelo.findById(req.params.id);
    console.log(j);
    j.jugadores.forEach(ele => {
        let num = numero();
        ele.apuesta = num;
    });

    let m = 0;
    let gan;
    j.jugadores.forEach(p => {

        if (p.apuesta > m) {
            m = p.apuesta;
            gan = p;
        }

    });

    j.ganador = gan;

    // res.json(j);
    console.log("|Se empezo el juego|");
});

function numero() {
    return Math.floor(Math.random() * (7 - 1)) + 1;
}

/** FUNCION eliminarEjemploId 
* obtiene un juego por id y lo elimina.
*/
cont.eliminarJuego = (async (req, res, err) => {
    await juegoModelo.findByIdAndDelete(req.params.id, req.body);
    // res.json({message: "Juego eliminado"});
});

module.exports = cont;