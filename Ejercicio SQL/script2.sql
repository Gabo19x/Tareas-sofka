use 'Tienda';

-- Obtener productos de una venta por cedula.
SELECT @cedula
SET @cedula = 1002;
SELECT @busqueda;

SELECT idVenta INTO @busqueda FROM Venta WHERE documentoCliente = @cedula, tipoDocumentoCliente = 'Cedula';
SELECT * FROM Producto WHERE idVenta = @busqueda;

-- Obtener proveedor por el nombre de un producto
SELECT @nombreProducto;
SET @nombreProducto = 'Manzana';
SELECT @proveedor;

SELECT idProveedor INTO @proveedor FROM Producto WHERE nombre = @nombreProducto;
SELECT * FROM Proveedor WHERE idProveedor = @proveedor;

