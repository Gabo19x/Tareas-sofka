var express = require('express');
var router = express.Router();

const controller = require('../controller/juegoController');

router.route('/')
    .get(function (req, res) {
        controller.obtenerJuegos;
    });

router.route('/crear')
    .post(function(req, res) {
        controller.crearJuego;        
    });
  
router.route('/empezar')
    .post(function (req, res) {
        controller.empezarJuego;        
    });


module.exports = router;