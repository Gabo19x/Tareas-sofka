// El modelo se usa para definir modelos
const { Schema, model} = require('mongoose');
const db = require('../database');

const ejemploSchema = new Schema({
    id: {
        type: String,
        required: true,
    },
    titulo: {
        type: String,
        required: true,
    },
    contenido: {
        type: String,
        trim: true,
    },
});

module.exports = model('ejemplo', ejemploSchema);