package Cliente;


import Fecha.Fecha;
import Tarifa.Tarifa;

public class Cliente implements Fecha{

    private String nombre;
    private String NIF;
    private Direccion direccion;
    private String correo;
    private Fecha fecha_Alta;
    Tarifa tarifa;

    //------------------------------------------------------------------
    // CONSTRUCTORES
    //------------------------------------------------------------------

    public Cliente(){

    }

    //------------------------------------------------------------------
    // METODOS DE USO
    //------------------------------------------------------------------





    //------------------------------------------------------------------
    // GETTERS Y SETTERS
    //------------------------------------------------------------------

    public Fecha getFecha(){
        return this.fecha_Alta;
    }

}
