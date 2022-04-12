package Cuatro;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public abstract class Vehiculo {
    
    private String nombre;
    private int pasajeros;
    private int pasajerosAusentes;
    private int ruedas;
    private String fechaMatriculacion;
    private String medioDesplazamiento;
    private String color;

    public Vehiculo(
        String nombre,int pasajeros, int pasajerosAusentes, int ruedas, String fechaMatriculacion,
        String medioDesplazamiento, String color){
        
        this.nombre = Objects.requireNonNull(nombre);
        this.pasajeros = Objects.requireNonNull(pasajeros);
        this.pasajerosAusentes = pasajerosAusentes;
        this.ruedas = Objects.requireNonNull(ruedas);
        this.fechaMatriculacion = Objects.requireNonNull(fechaMatriculacion);
        this.medioDesplazamiento = medioDesplazamiento;
        this.color = color;
    }

    public void info(){
        System.out.println("------------------------------");
        System.out.println("Informacion basica del vehiculo: "+this.nombre);
        System.out.println("Pasajeros: "+ this.pasajeros+" ausentes: "+ this.pasajerosAusentes);
        System.out.println("Fecha de matricula: "+ this.fechaMatriculacion);
        System.out.println("Numero de ruedas: "+ this.ruedas);
        System.out.println("Medio de desplazamiento: "+ this.medioDesplazamiento);
        System.out.println("Color: "+ this.color);
        System.out.println("------------------------------");
    }

    public ArrayList<Vehiculo> lectura10Vehiculos(){
        ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();

        for (int i = 0; i < 10; i++) {
            Vehiculo v;
            v = crearVehiculo();
            lista.add(v);
        }

        System.out.println("---                   ---");
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).info();
        }
        System.out.println("---                   ---");

        return lista;
    }

    private Vehiculo crearVehiculo(){
        Scanner sc = new Scanner(System.in);

        String nombre;
        int pasajeros;
        int pasajerosAusentes;
        int ruedas;
        String fechaMatriculacion;
        String medioDesplazamiento;
        String color;

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
        System.out.println("------------------------------");

        Vehiculo vehiculo = new Vehiculo(nombre, pasajeros, pasajerosAusentes, ruedas, fechaMatriculacion, medioDesplazamiento, color) {};
        return vehiculo;
         
    }

    public void setNombre(String nuevo){
        this.nombre = nuevo;
    }

    public String getNombre(){
        return nombre;
    }

    public void setPasajeros(int pasajeros){
        this.pasajeros = pasajeros;
    }

    public int getPasajeros(){
        return pasajeros;
    }

    public void setPasajerosAusentes(int pasajeros){
        this.pasajerosAusentes = pasajeros;
    }

    public int getPasajerosAusentes(){
        return pasajerosAusentes;
    }

    public int getRuedas(){
        return ruedas;
    }

    public String getFecha(){
        return fechaMatriculacion;
    }

    public String getMedio(){
        return medioDesplazamiento;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }
}
