var express = require('express');
var router = express.Router();

const {crearJuego, empezarJuego} = require('../controller/juegoController');

router.route('/crear')
    .get(console.log("|GET| en crear"))
    .post(crearJuego);
  
router.route('/empezar')
    .get(console.log("|GET| en empezar"))
    .post(empezarJuego);


module.exports = router;