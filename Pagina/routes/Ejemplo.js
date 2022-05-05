var {Router} = require('express');
var router = Router();

const {getEjemplo, crearEjemplo} = require('../controller/ejemploController');

router.route('/ejemplo')
  .get(getEjemplo)
  .post(crearEjemplo);

router.route('/ejemplo/:id')
  .get((req, res) => res.json({men: '|GET| Ejemplo ruta'}))
  .delete((req, res) => res.json({men: '|DELETE| Ejemplo ruta'}));
 
/** Peticiones
 * .get() -> para obtener un dato.
 * .post() -> para guardar algo nuevo.
 * .put() -> para actualizar todo.
 * .patch() -> para actualizar una propiedad.
 * .delete() -> para borrar un dato.
 */
module.exports = router;
