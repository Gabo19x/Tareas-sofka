package Cinco;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import Cuatro.Vehiculo;

public class Carro extends Vehiculo {
    private String tipoCombustible;
    private String placa;
    private boolean esParticular;
    private String tipo;
    private double altura;

    public Carro(String nombre, int pasajeros, int pasajerosAusentes, 
            int ruedas, String fechaMatriculacion,
            String medioDesplazamiento, String color,
            String tipoCombustible, String placa, boolean esParticular, String tipo, double altura) {
        super(nombre, pasajeros, pasajerosAusentes, ruedas, fechaMatriculacion, medioDesplazamiento, color);
        
        this.tipoCombustible = tipoCombustible;
        this.placa = Objects.requireNonNull(placa);
        this.esParticular = Objects.requireNonNull(esParticular);
        this.tipo = tipo;
        this.altura = altura;
    }
    
    public void infoAdicional(){
        System.out.println("------------------------------");
        System.out.println("Informacion adicional del vehiculo [carro]: "+this.nombre);
        System.out.println("Tipo de combustible de uso: "+ this.tipoCombustible);
        System.out.println("Placa: "+ this.placa+" tipo de vehiculo: "+this.tipo);
        if (esParticular) System.out.println("El vehiculo es particular ");
        else System.out.println("El vehiculo es de transporte publico ");

        System.out.println("Altura: "+ this.altura);
        System.out.println("------------------------------");
    }

    /** FUNCION lectura10Carros: llama a la funcion crearCarro 10 veces para crear
     *  10 instancias y los devuelve en un array
     * @return lista un array de objetos carro
     */
    public ArrayList<Carro> lectura10Carros(){
        ArrayList<Carro> lista = new ArrayList<Carro>();

        for (int i = 0; i < 10; i++) {
            Carro v;
            v = crearCarro();
            lista.add(v);
        }

        System.out.println("---                   ---");
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).info();
        }
        System.out.println("---                   ---");

        return lista;
    }
    
    /** FUNCION crearCarro: crea un carro pidiendo los datos por teclado.
     * @return carro.
     */
    public Carro crearCarro(){
        Scanner sc = new Scanner(System.in);

        String nombre;
        int pasajeros;
        int pasajerosAusentes;
        int ruedas;
        String fechaMatriculacion;
        String medioDesplazamiento;
        String color;

        String tipoCombustible;
        String placa;
        boolean esParticular;
        String tipo;
        double altura;

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
        System.out.println("-  -  -  [Info Carro]  -  -  -");
        System.out.println("Ingrese el tipo de combustible: ");
        tipoCombustible = sc.nextLine();
        System.out.println("Ingrese la placa: ");
        placa = sc.nextLine();
        System.out.println("Es un automotor particular? (s/n)");
        String es = sc.nextLine();
        if (es == "s") {
            esParticular = true;
        } else {
            esParticular = false;
        }
        System.out.println("Tipo de vehiculo: ");
        tipo = sc.nextLine();
        System.out.println("Ingrese la altura: ");
        altura = sc.nextDouble();
        System.out.println("------------------------------");

        Carro carro = new Carro(nombre, pasajeros, pasajerosAusentes, ruedas, fechaMatriculacion, 
        medioDesplazamiento, color, tipoCombustible, placa, esParticular, tipo, altura) {};
        return carro;
         
    }


    public String gettipoCombustible(){
        return tipoCombustible;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getPlaca(){
        return placa;
    }

    public void setNombre(boolean esParticular){
        this.esParticular = esParticular;
    }

    public boolean getEsParticular(){
        return esParticular;
    }

    public String getTipo(){
        return tipo;
    }

    public void settipo(String nuevo){
        this.tipo = nuevo;
    }

    public double getAltura(){
        return altura;
    }
}
