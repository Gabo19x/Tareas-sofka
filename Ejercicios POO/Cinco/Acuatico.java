package Cinco;

import java.util.Objects;
import java.util.Scanner;

import Cuatro.Vehiculo;

public class Acuatico extends Vehiculo {
    private String tipo;
    private double peso;
    private double altura;
    private String matricula;
    private String propulsion;

    public Acuatico(String nombre, int pasajeros, int pasajerosAusentes, 
            int ruedas, String fechaMatriculacion,
            String medioDesplazamiento, String color,
            String tipo, double peso, double altura, String matricula, String propulsion) {
        super(nombre, pasajeros, pasajerosAusentes, ruedas, fechaMatriculacion, medioDesplazamiento, color);
        
        this.tipo = tipo;
        this.peso = peso;
        this.altura = altura;
        this.matricula = Objects.requireNonNull(matricula);
        this.propulsion = propulsion;
        
    }

    public void infoAdicional(){
        System.out.println("------------------------------");
        System.out.println("Informacion adicional del vehiculo [acuatico]: "+this.nombre);
        System.out.println("Matricula: "+ this.matricula+" tipo de vehiculo: "+this.tipo);
        System.out.println("Metodo de propulsion: "+ this.propulsion);
        System.out.println("Altura: "+ this.altura+ " peso: "+ this.peso);
        System.out.println("------------------------------");
    }

    /** FUNCION crearAcuatico: crea un vehiculo acuatico pidiendo los datos por teclado.
     * @return vehiculo.
     */
    public Vehiculo crearAcuatico(){
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
        double altura;
        String matricula;
        String propulsion;

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
        System.out.println("-  [Info vehiculo acuatico]  -");
        System.out.println("Ingrese el tipo de bicicleta: ");
        tipo = sc.next();
        System.out.println("Ingrese el peso: ");
        peso = sc.nextDouble();
        System.out.println("Ingrese la altura: ");
        altura = sc.nextDouble();
        System.out.println("Ingrese la matricula: ");
        matricula = sc.next();
        System.out.println("Ingrese el metodo de propulsion: ");
        propulsion = sc.next();
        System.out.println("------------------------------");

        Acuatico vehiculo = new Acuatico(nombre, pasajeros, pasajerosAusentes, ruedas, fechaMatriculacion, 
        medioDesplazamiento, color, tipo, peso, altura, matricula, propulsion) {};
        return vehiculo;
         
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

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setPropulsion(String nuevo){
        this.propulsion = nuevo;
    }

    public String getPropulsion(){
        return propulsion;
    }
}

