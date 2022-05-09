var express = require('express');
var router = express.Router();

const {obtenerEjemplos, crearEjemplo, obtenerEjemploId, eliminarEjemploId, actualizarEjemploId} = require('../controller/ejemploController');

router.route('/')
  .get(obtenerEjemplos)
  .post(crearEjemplo);

router.route('/:id')
  .get(obtenerEjemploId)
  .delete(eliminarEjemploId)
  .put(actualizarEjemploId);
 
/** Peticiones http
 * .get() -> para obtener un dato.
 * .post() -> para guardar algo nuevo.
 * .put() -> para actualizar todo.
 * .patch() -> para actualizar una propiedad.
 * .delete() -> para borrar un dato.

 * Peticiones Node
 * .find() -> para consultar todos los datos.
 * .findById() -> para consultar por un id.
 * .findByIdAndDelete() -> para consultar por id y borrar al mismo tiempo.
 * .findByIdAndUpdate() -> para consultar por id y actualizar.
 * .save() -> para guardar un dato.
 */
module.exports = router;
