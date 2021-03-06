var mongoose = require('mongoose');

function conectar() {
    const URI = process.env.MONGODB_URI 
    ? process.env.MONGODB_URI 
    : 'mongodb://localhost/database';

    mongoose.connect(URI, (err, res) => {
        if (err) {
          console.log("Error: connecting to databse. " + err);
        }});
    // { useNewUrlParser: true, useCreateIndex: true, }


    const connection = mongoose.connection;
    connection.once('open', () => {
        console.log("Base de datos conectada en puerto: "+3000);
    });
}

module.exports = conectar();