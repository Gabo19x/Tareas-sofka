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
        type: Number, 
    }
});

module.exports = model('jugador', jugadorSchema);