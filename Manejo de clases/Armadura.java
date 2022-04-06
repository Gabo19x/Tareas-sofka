/*
*   CLASE Armadura: representa a una armadura generica.
*   @author: Gabriel Pinzon
*/ 

public class Armadura{

    // Variables corrrespondientes
    public String name;
    protected String color;
    private String material;

    /*
    * Crea una instancia de Armadura
    */
    public Armadura(String name, String color, String material){
        this.name = name;
        this.color = color;
        this.material = material;
    }

    /*
    * FUNCION setName: cambia la variable name.
    * @param name: nuevo nombre.
    */
    public void setName(String name){
        this.name = name;
    }

    /*
    * FUNCION getName: retorna la variable name.
    * @return: retorna el la variable name.
    */
    public String getName(){
        return this.name;
    }

    /*
    * FUNCION getMaterial: retorna la variable material.
    * @return: retorna la variable material.
    */
    public String getMaterial(){
        return this.material;
    }

    /*
    * FUNCION paint: cambia el color.
    * @param newColor: nuevo color.
    */
    public void paint(String newColor){
        System.out.println("Se a pintado con el nuevo color");
        this.color = newColor;
    }
}