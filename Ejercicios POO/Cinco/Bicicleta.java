package Cinco;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import Cuatro.Vehiculo;

public class Bicicleta extends Vehiculo {
    private String tipo;
    private double peso;
    private String tarjetaPropiedad;

    public Bicicleta(String nombre, int pasajeros, int pasajerosAusentes, 
            int ruedas, String fechaMatriculacion,
            String medioDesplazamiento, String color,
            String tipo, double peso, String tarjetaPropiedad) {
        super(nombre, pasajeros, pasajerosAusentes, ruedas, fechaMatriculacion, medioDesplazamiento, color);
        
        this.tipo = tipo;
        this.peso = peso;
        this.tarjetaPropiedad = Objects.requireNonNull(tarjetaPropiedad);
        
    }

    public void infoAdicional(){
        System.out.println("------------------------------");
        System.out.println("Informacion adicional del vehiculo [Bicicleta]: "+this.nombre);
        System.out.println("Peso: "+ this.peso+" tipo de bicicleta: "+this.tipo);
        System.out.println("Tarjeta de propiedad: "+ this.tarjetaPropiedad);
        System.out.println("------------------------------");
    }

    /** FUNCION lectura10Bicicletas: llama a la funcion crearBicicleta 10 veces para crear
     *  10 instancias y los devuelve en un array
     * @return lista un array de objetos bicicleta
     */
    public ArrayList<Bicicleta> lectura10Bicicletas(){
        ArrayList<Bicicleta> lista = new ArrayList<Bicicleta>();

        for (int i = 0; i < 10; i++) {
            Bicicleta v;
            v = crearBicicleta();
            lista.add(v);
        }

        System.out.println("---                   ---");
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).info();
        }
        System.out.println("---                   ---");

        return lista;
    }
    
    /** FUNCION crearBicicleta: crea una bicicleta pidiendo los datos por teclado.
     * @return bicicleta.
     */
    public Bicicleta crearBicicleta(){
        Scanner sc = new Scanner(System.in);

        String nombre;
        int pasajeros;
        int pasajerosAusentes;
        int ruedas;
        String fechaMatriculacion;
        String medioDesplazamiento;
        String color;

        String tipo;
        double peso;
        String tarjetaPropiedad;

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
        System.out.println("-  -  -  [Info Bicicleta]  -  -  -");
        System.out.println("Ingrese el tipo de bicicleta: ");
        tipo = sc.next();
        System.out.println("Ingrese el peso: ");
        peso = sc.nextDouble();
        System.out.println("Ingrese un texto sobre la tarjeta de propiedad: ");
        tarjetaPropiedad = sc.next();
        System.out.println("------------------------------");

        Bicicleta bici = new Bicicleta(nombre, pasajeros, pasajerosAusentes, ruedas, fechaMatriculacion, 
        medioDesplazamiento, color, tipo, peso, tarjetaPropiedad) {};
        return bici;
         
    }

    public String getTipo(){
        return tipo;
    }

    public void settipo(String nuevo){
        this.tipo = nuevo;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public String getTarjeta(){
        return tarjetaPropiedad;
    }
}
