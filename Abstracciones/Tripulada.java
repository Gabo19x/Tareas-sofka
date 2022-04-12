package Abstracciones;

public class Tripulada extends Nave{
    
    protected int personal;
    private float missionDuration;
    protected String destiny;
    
    public Tripulada(int personal, float missionDuration, String destiny, String weight, String fuel, String mission){
        super(weight, fuel, mission);
        this.personal = personal;
        this.missionDuration = missionDuration;
        this.destiny = destiny;
    }

    public void setMissionDuration(float duration){
        this.missionDuration = duration;
    }

    public void missionInfo(){
        System.out.println("Caracteristicas de mision");
        System.out.println("Mision: "+ this.mission);
        System.out.println("Duracion teorica de mision: "+ this.missionDuration);
        System.out.println("Personal a bordo: "+ this.personal);
        System.out.println("Destino: " + this.destiny);
    }
}