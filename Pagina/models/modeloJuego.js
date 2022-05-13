const { Schema, model } = require('mongoose');
const db = require('../database');
const modeloJugador = require('./modeloJugador');

const juegoSchema = new Schema({
    id: {
        type: Number
    },
    jugadores: [
        { idj: Number, nombre: String, apuesta: Number },
    ],
    ganador: {
        idj: String, nombre: String, apuesta: Number,
    }
});

module.exports = model('juego', juegoSchema);