var {Router} = require('express');
var router = Router();

router.route('/')
  .get((req, res) => res.json({men: '|GET| Ejemplo ruta'}))
  .post((req, res) => res.json({men: '|POST| Ejemplo ruta'}));

router.route('/:id')
.delete((req, res) => res.json({men: '|DELETE| Ejemplo ruta'}));
 
/** Peticiones
 * .get() -> para obtener un dato.
 * .post() -> para guardar algo nuevo.
 * .put() -> para actualizar todo.
 * .patch() -> para actualizar una propiedad.
 * .delete() -> para borrar un dato.
 */
module.exports = router;
