const { json } = require('express');
const { Schema, model} = require('mongoose');
const db = require('../database');
const modeloJugador = require('./modeloJugador');

const juegoSchema = new Schema({
    id: {
        type: String
    },
    jugadores: {
        type: [String],
    },
    ganador: {
        type: Object,
    }
});

module.exports = model('juego', juegoSchema);