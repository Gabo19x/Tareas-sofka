var express = require('express');
var app = express();

//hbs
const hbs = require('hbs');
hbs.registerPartials(__dirname + '/views/partials', function (err) {});
app.set('view engine', 'hbs');
app.set("views", __dirname + '/views');

app.use(express.static(__dirname + "/public"));

// configuraciones | settings
app.set('port', process.env.PORT || 3000);

// funciones | middlewares
app.use(express.json());

// rutas | routes
// app.get('/', (req, res) => {
//     let e = 33;
//     res.render('index', {
//         titulo: 'Titulo',
//         nombre: 'Pancracio',
//         mayor: e > 18 ? true : false,
//         edad: e, 
//     });
// });
// app.get('/', require('./routes/funcionesJuego'));
// app.use('/juego', require('./routes/juego'));

app.use('/ejemplo', require('./routes/ejemplo'));
// app.get('/test', (req, res) => res.send('Ruta de test'));

module.exports = app; 
