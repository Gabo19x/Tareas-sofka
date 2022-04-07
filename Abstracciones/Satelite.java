public class Satelite extends Nave{
    
    protected String purpose;
    
    public Satelite(String purpose, String weight, String fuel, String mission){
        super(weight, fuel, mission);
        this.purpose = purpose;
    }

    public String getPurpose(){
        return this.purpose;
    }

    public void comunication(){
        System.out.println("Conectandose con base...");
        System.out.println("Enviando datos obtenidos...");
        System.out.println("Enviando estado de combustible "+ this.fuel);
    }
}