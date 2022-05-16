-- Base de datos
CREATE DATABASE 'Tienda';
use 'Tienda';

-- Tabla Proveedor
CREATE TABLE 'Proveedor' (
  `idProveedor` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idProveedor`))

-- Tabla Producto
CREATE TABLE 'Producto' (
  `idProducto` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `precio` VARCHAR(45) NOT NULL,
  `idProveedor` INT NOT NULL,
  `idVenta` INT NOT NULL,
  PRIMARY KEY (`idProducto`),
  INDEX `fk_proveedor_idx` (`idProveedor` ASC) VISIBLE,
  INDEX `fk_venta_idx` (`idVenta` ASC) VISIBLE,
  CONSTRAINT `fk_proveedor`
    FOREIGN KEY (`idProveedor`)
    REFERENCES `Tienda_prueba`.`Proveedor` (`idProveedor`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_venta`
    FOREIGN KEY (`idVenta`)
    REFERENCES `Tienda_prueba`.`Venta` (`idVenta`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)


-- Tabla Venta
CREATE TABLE `Venta` (
   `idVenta` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `idVendedor` INT NOT NULL,
  `documentoCliente` INT(100) NOT NULL,
  `tipoDocumentoCliente` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idVenta`),
  INDEX `fk_vendedor_idx` (`idVendedor` ASC) VISIBLE,
  CONSTRAINT `fk_vendedor`
    FOREIGN KEY (`idVendedor`)
    REFERENCES `Tienda_prueba`.`Vendedor` (`idVendedor`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)


-- Tabla Vendedor
CREATE TABLE `Vendedor` (
  `idVendedor` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idVendedor`),

-- Datos: Proveedor
INSERT INTO Proveedor(nombre) VALUES
    ('Frutas SAS'),
    ('Metales SA'),
    ('Gabriel tienda');

-- Datos: Vendedor unico
INSERT INTO Vendedor (nombre) VALUES
    ('Dueño');

-- Datos: Venta
INSERT INTO Venta(nombre, idVendedor, documentoCliente, tipoDocumentoCliente) VALUES
    ('Venta 01', 1, 1001, 'Cedula'),
    ('Venta 02', 1, 1002, 'Cedula'),
    ('Venta prueba', 1, 1000, 'Cedula');

INSERT INTO Producto(nombre, precio, idProveedor, idVenta) VALUES
    ('Manzana', 1200, 1, 1),
    ('Pera', 1300, 1, 1),
    ('Hierro', 9500, 2, 2),
    ('Oro', 12000, 2, 2),
    ('Cereza', 1000, 1, 1),
    ('Tomate', 2000, 1, 1),
    ('Banana', 3000, 1, 1);

DELETE FROM Venta WHERE idVenta = 3;

UPDATE Producto SET precio = 1300, idProveedor = 3 WHERE nombre='Cereza'; 
UPDATE Producto SET precio = 1850, idProveedor = 3 WHERE nombre='Tomate'; 
UPDATE Producto SET precio = 2500, idProveedor = 3 WHERE nombre='Banana'; 
