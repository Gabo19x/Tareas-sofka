/*
*   CLASE Pergamino: representa a un pergamino.
*   @author: Gabriel Pinzon
*/ 

public class Pergamino{

    // Variables corrrespondientes
    private int id;
    protected String text;
    public String storageAddress;

    /*
    * Crea una instancia de Pergamino
    */
    public Pergamino(int id, String text, String storageAddress){
        this.id = id;
        this.text = text;
        this.storageAddress = storageAddress;
    }

    /*
    * FUNCION setText: cambia la variable text.
    * @param text: nuevo texto.
    */
    public void setText(String text){
        this.text = text;
    }

    /*
    * FUNCION getId: retorna la variable id.
    * @return: retorna la variable id.
    */
    public String getId(){
        return this.id;
    }

    /*
    * FUNCION setAddress: cambia la variable storageAddress.
    * @param newAddress: nuevo direccion.
    */
    public void setAddress(String newAddress){
        this.storageAddress = newAddress;
    }

    /*
    * FUNCION getStorageAddress: retorna la variable storageAddress.
    * @return: retorna la variable storageAddress.
    */
    public String getStorageAddress(){
        return this.storageAddress;
    }
}