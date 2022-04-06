/*
*   CLASE CuentaBancaria: representa a una cuenta bancaria generica.
*   @author: Gabriel Pinzon
*/ 

public class CuentaBancaria{

    // Variables corrrespondientes
    private int accountNumber;
    protected boolean activated;

    /*
    * Crea una instancia de CuentaBancaria
    */
    public CuentaBancaria(int accountNumber, boolean activated){
        this.accountNumber = accountNumber;
        this.activated = activated;
    }

    /*
    * FUNCION setActived: cambia la variable activated.
    * @param activated: nueva variable para cambiar activated.
    */
    public void setActived(boolean activated){
        this.activated = activated;
    }

    /*
    * FUNCION getActived: retorna la variable actived.
    * @return: retorna la variable actived.
    */
    public String getActived(){
        return this.activated;
    }
}