const cont = {};

cont.getEjemplo = ((req, res) => res.json({men: '|GET| Ejemplo ruta'}));
cont.crearEjemplo = ((req, res) => res.json({men: '|POST| Ejemplo ruta'}));

module.exports = cont;