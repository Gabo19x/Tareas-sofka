const { Int32 } = require('mongodb');
const { Schema, model} = require('mongoose');
const db = require('../database');

const jugadorSchema = new Schema({
    idj: {
        type: String,
        required: true,
    },
    nombre: {
        type: String,
        trim: true
    },
    apuesta : {
        type: String, 
    }
});

module.exports = model('jugador', jugadorSchema);