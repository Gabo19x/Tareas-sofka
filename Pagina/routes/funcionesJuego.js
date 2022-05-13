var express = require('express');
var router = express.Router();

const controller = require('../controller/juegoController');
    

router.route('/inicio')
    .get((req, res) => { res.render('inicio') })
    .get(function (req, res) {
        controller.obtenerJuegos(req, res);
    });

router.route('/crear')
    .get((req, res) => { res.render('crear') })
    .post(controller.crearJuego);

router.route('/inicio/empezar')
    .get(function (req, res) {
        controller.empezarJuego(req, res);
    });

router.route('/eliminar')
    .delete(function (req, res) {
        controller.eliminarJuego(req, res);
    });

module.exports = router;
