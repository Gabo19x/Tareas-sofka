/*
*   CLASE Escudo: representa a un escudo generico.
*   @author: Gabriel Pinzon
*/ 

public class Escudo{

    // Variables corrrespondientes
    public String name;
    private float height;
    private float weight;
    protected String material;
    public String type;

    /*
    * Crea una instancia de Escudo
    */
    public Escudo(String name, float height, float weight, String material, String type){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.material = material;
        this.type = type;
    }

    /*
    * FUNCION setName: cambia la variable name.
    * @param name: nuevo nombre.
    */
    public void setName(String name){
        this.name = name;
    }

    /*
    * FUNCION getMaterial: retorna la variable material.
    * @return: retorna la variable material.
    */
    public String getMaterial(){
        return this.material;
    }

    /*
    * FUNCION info: muestra las variables name, height, weight, type.
    */
    public void info(){
        System.out.println("Name: "+ this.name);
        System.out.println("Height: "+ this.height);
        System.out.println("Weight: "+ this.weight);
        System.out.println("Type: "+ this.type);
    }
}