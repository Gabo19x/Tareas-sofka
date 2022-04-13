package Cuatro;

import Cinco.Bicicleta;

public class App {
    public static void main(String[] args) {
        Vehiculo algo = new Vehiculo("Moto", 2, 1, 3, "2-2-21", "Tierra", "Rojo") {};

        algo.info();
        algo.lectura10Vehiculos();

        Bicicleta gw = new Bicicleta("Bici", 1, 1, 2, "2-8-21", "Tierra", "Rojo", "Todo-terreno", 10, "Tarjeta: de Gabriel. 11-01-21") {};
        gw.info();
        gw.infoAdicional();
        Bicicleta raly = (Bicicleta) gw.crearBicicleta();
    }
}
