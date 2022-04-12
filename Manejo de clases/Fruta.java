import java.util.ArrayList;

/*
*   CLASE Fruta: representa a las frutas.
*   @author: Gabriel Pinzon
*/ 

public class Fruta{

    // Variables corrrespondientes
    public String name;
    private String avarageWeight;
    protected ArrayList<String> colors;

    /*
    * Crea una instancia de Fruta
    */
    public Fruta(String name, String avarageWeight, ArrayList<String> colors){
        this.name = name;
        this.avarageWeight = avarageWeight;
        this.colors = colors;
    }

    /*
    * FUNCION setColor: agrega un color al array colors.
    * @param name: nuevo color a agregar.
    */
    public void setColor(String name){
        this.colors.add(name);
    }

    /*
    * FUNCION getColors: retorna el array colors.
    * @return: retorna el array colors.
    */
    public ArrayList<String> getColors(){
        return this.colors;
    }
}