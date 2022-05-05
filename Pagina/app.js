var express = require('express');
var app = express();

// configuraciones | settings
app.set('port', process.env.PORT || 3000);
console.log("Puerto: " , 3000);

// funciones | middlewares
app.use(express.json());

// rutas | routes
app.get('/ejemplo', require('./routes/Ejemplo'));
app.get('/get', (req, res) => res.send('Ruta de ejemplo con .GET'));

module.exports = app; 
