package Abstracciones;

public class Lanzadera extends Nave{
    
    protected String load;
    protected String destiny;
    
    public Lanzadera(String load, String destiny, String weight, String fuel, String mission){
        super(weight, fuel, mission);
        this.load = load;
        this.destiny = destiny;
    }

    public String getLoad(){
        return this.load;
    }

    public String getDestiny(){
        return this.destiny;
    }

    public void travelStatus(){
        System.out.println("Enviando distancia restante...");
        System.out.println("Enviando cantidad de combustible: " + this.fuel);
        System.out.println("Enviando estado de la carga: " + this.load);
    }
}