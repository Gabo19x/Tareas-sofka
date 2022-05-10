var express = require('express');
var router = express.Router();
  
const controller = require('../controller/juegoController');

router.route('/:id')
    .get(function (req, res) {
        controller.obtenerJuego;
    });

router.route('/:id/ganador')
    .get(function (req, res) {
        controller.obtenerGanador;
    });

module.exports = router;