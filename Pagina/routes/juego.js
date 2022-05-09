var express = require('express');
var router = express.Router();
  
const {obtenerJuego, obtenerGanador} = require('../controller/juegoController');

router.route('/:id')
    .get(obtenerJuego);

router.route('/:id/ganador')
    .get(obtenerGanador);

module.exports = router;