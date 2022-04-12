package Uno;

import java.util.Objects;

public abstract class Astro{
    private String nombre;
    private String id;
    private double masa;
    private double diametro;
    private double radio;
    private double densidad;
    private double distanciaSol;
    private double gravedad;

    public Astro (
        String nombre, String id, double masa, double diametro, 
        double densidad, double distanciaSol, double gravedad){

        this.nombre = Objects.requireNonNull(nombre);
        this.id = Objects.requireNonNull(id);
        this.masa = masa;
        this.diametro = diametro;
        this.radio = diametro / 2;
        this.densidad = densidad;
        this.distanciaSol = distanciaSol;
        this.gravedad = gravedad;
    }

    public void info(){
        System.out.println(
            "Nombre: " + this.nombre + "\nId: " + this.id + 
            "\nMasa: " + this.masa + "\nDiametro: " + this.diametro
        );
    }

    public double atraccionGravitatoria(double G, Astro astro2, double distancia){
        double fuerza = (G * this.masa * astro2.masa)/(distancia*distancia);
        return fuerza;
    }
}