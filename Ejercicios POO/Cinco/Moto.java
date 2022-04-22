package Cinco;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import Cuatro.Vehiculo;

public class Moto extends Vehiculo {
    private String placa;
    private double cilindraje;
    private double largo;

    public Moto(String nombre, int pasajeros, int pasajerosAusentes, 
            int ruedas, String fechaMatriculacion,
            String medioDesplazamiento, String color,
            String placa, double cilindraje, double largo) {
        super(nombre, pasajeros, pasajerosAusentes, ruedas, fechaMatriculacion, medioDesplazamiento, color);
        
        this.placa = Objects.requireNonNull(placa);
        this.cilindraje = cilindraje;
        this.largo = largo;
    }

    public void infoAdicional(){
        System.out.println("------------------------------");
        System.out.println("Informacion adicional del vehiculo [moto]: "+this.nombre);
        System.out.println("Placa: "+ this.placa);
        System.out.println("Cilindraje de: "+ this.cilindraje);
        System.out.println("Largo: "+ this.largo);
        System.out.println("------------------------------");
    }

    /** FUNCION lectura10Motos: llama a la funcion crearMoto 10 veces para crear
     *  10 instancias y los devuelve en un array
     * @return lista un array de objetos Moto
     */
    public ArrayList<Moto> lectura10Motos(){
        ArrayList<Moto> lista = new ArrayList<Moto>();

        for (int i = 0; i < 10; i++) {
            Moto v;
            v = crearMoto();
            lista.add(v);
        }

        System.out.println("---                   ---");
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).info();
        }
        System.out.println("---                   ---");

        return lista;
    }

    /** FUNCION crearMoto: crea una moto pidiendo los datos por teclado.
     * @return moto.
     */
    public Moto crearMoto(){
        Scanner sc = new Scanner(System.in);

        String nombre;
        int pasajeros;
        int pasajerosAusentes;
        int ruedas;
        String fechaMatriculacion;
        String medioDesplazamiento;
        String color;

        String placa;
        double cilindraje;
        double largo;

        System.out.println("Ingrese el nombre del nuevo vehiculo: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese el numero de pasajeros: ");
        pasajeros = sc.nextInt();
        System.out.println("Ingrese el numero de pasajeros ausentes: ");
        pasajerosAusentes = sc.nextInt();
        System.out.println("Ingrese el numero de ruedas: ");
        ruedas = sc.nextInt();
        System.out.println("Ingrese la fecha de matricula: ");
        fechaMatriculacion = sc.next();
        System.out.println("Ingrese el medio en que se desplaza el vehiculo: ");
        medioDesplazamiento = sc.next();
        System.out.println("Ingrese el color: ");
        color = sc.next();
        System.out.println("-  -  -  [Info Moto]  -  -  -");
        System.out.println("Ingrese la placa: ");
        placa = sc.next();
        System.out.println("Ingrese el cilindraje: ");
        cilindraje = sc.nextDouble();
        System.out.println("Ingrese el largo: ");
        largo = sc.nextDouble();
        System.out.println("------------------------------");

        Moto moto = new Moto(nombre, pasajeros, pasajerosAusentes, ruedas, fechaMatriculacion, 
        medioDesplazamiento, color, placa, cilindraje, largo) {};
        return moto;
         
    }


    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getPlaca(){
        return placa;
    }

    public double getCilindraje(){
        return cilindraje;
    }

    public double getLargo(){
        return largo;
    }
}
