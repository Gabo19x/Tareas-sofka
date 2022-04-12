import java.sql.Date;

/*
*   CLASE Persona: representa a una persona tradicional.
*   @author: Gabriel Pinzon
*/ 

public class Persona{

    // Variables corrrespondientes
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;

    /*
    * Crea un ainstancia de Persona
    */
    public Persona(String name, String lastName1, String lastName2, Date dateBirth, float height){
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    /*
    * FUNCION setName: cambia el valor de la variable name.
    * @param name: nuevo nombre
    */
    public void setName(String name){
        this.name = name;
    }

    /*
    * FUNCION getName: retorna la variable name.
    * @return: retorna la variable name
    */
    public String getName(){
        return this.name;
    }
}