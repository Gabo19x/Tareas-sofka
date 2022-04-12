package Abstracciones;

public abstract class Nave{
    protected String weight;
    protected String fuel;
    protected String mission;

    public Nave(String weight, String fuel, String mission){
        this.weight = weight;
        this.fuel = fuel;
        this.mission = mission;
    }

    public String getWeight(){
        return this.weight;
    }

    public String getFuel(){
        return this.fuel;
    }

    public String getMission(){
        return this.mission;
    }
}