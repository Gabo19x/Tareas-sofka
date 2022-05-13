var express = require('express');
var router = express.Router();
  
const controller = require('../controller/juegoController');

router.route('/id')
    // .get((req, res) => { res.render('ganador')})
    .get(function (req, res) {
        controller.obtenerJuego(req, res);
    });

router.route('/ganador')
    .get(function (req, res) {
        controller.obtenerGanador(req, res);
        console.log("|GET| Ruta /:id/ganador");
    }).get((req, res) => { res.render('ganador')});

module.exports = router;