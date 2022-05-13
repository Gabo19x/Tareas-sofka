var express = require('express');
var app = express();
var path = require('path');
var bodyParser = require('body-parser');

// configuraciones | settings
app.set('port', process.env.PORT || 3000);

// funciones | middlewares
app.use(bodyParser.json());
app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'hbs');
app.use(express.static(path.join(__dirname, 'public')));

// rutas | routes
app.use('/juego', require('./routes/funcionesJuego'));
app.use('/juego', require('./routes/juego'));

// app.use('/ejemplo', require('./routes/ejemplo'));
// app.get('/test', (req, res) => res.send('Ruta de test'));

module.exports = app; 
