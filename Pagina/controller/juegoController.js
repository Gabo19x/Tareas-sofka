const cont = {};

const juegoModelo = require('../models/modeloJuego');
const jugadorModelo = require('../models/modeloJugador');

/** FUNCION crearJuego 
 * crea un juego y a 3 jugadores.
 */
cont.crearJuego = ( async (req, res) => {
    const {id, jugadores, ganador} = req.body;

    const juego = new juegoModelo({
        id,
        jugadores: [
            {idj: 1, nombre: "Juan", apuesta: 0},
            {idj: 2, nombre: "Armando", apuesta: 0},
            {idj: 3, nombre: "Pedro", apuesta: 0},
        ],
    });

    await juego.save();
});

/** FUNCION crearJugador 
 * crea un jugador.
 */
// cont.crearJugador = ( async (req, res) => {
//     const {idj, nombre} = req.body;
//     const j = new jugadorModelo({
//         idj, nombre,
//     });
//     await j.save();
// });

/** FUNCION obtenerJuegos 
 * obtiene todos los juegos.
 */
 cont.obtenerJuegos = async (req, res) => {
    const js = await juegoModelo.find();
    res.json(js);
};

/** FUNCION obtenerJuego 
 * obtiene un juego por id.
 */
cont.obtenerJuego = async (req, res) => {
    const j = await juegoModelo.findById(req.params.id);
    res.json(j);
};

/** FUNCION obtenerGanador 
 * obtiene un ganador del juego
 */
cont.obtenerGanador = async (req, res) => {
    const j = await juegoModelo.findById(req.params.id);
    const g = j.ganador;
    if(g == null){
        res.json({message: 'No hay ganador'})
    }else{
        res.json(g);
    }
};

/** FUNCION empezarJuego 
 * asigna un numero por jugador
 */
cont.empezarJuego = async (req, res) => {
    const j = await juegoModelo.findById(req.params.id);
    const p1 = j.jugadores[0];
    const p2 = j.jugadores[1];
    const p3 = j.jugadores[2];

    let num = numero();
    p1.apuesta = num.toString();
    num = numero();
    p2.apuesta = num.toString();
    num = numero();
    p3.apuesta = num.toString();
    
    res.json(j);
};

function numero() {
    return Math.floor(Math.random() * (7 - 1)) + 1;
}