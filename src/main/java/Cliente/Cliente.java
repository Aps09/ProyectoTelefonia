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
        this.nombre = null;
        this.NIF = null;
        this.direccion = null;
        this.correo = null;
        this.fecha_Alta = null;
        this.tarifa = new Tarifa();
    }

    public Cliente(String nombre, String NIF, Direccion direccion, String correo, Fecha fecha, Tarifa tarifa){
        this.nombre = nombre;
        this.NIF = NIF;
        this.direccion = direccion;
        this.correo = correo;
        this.fecha_Alta = fecha;
        this.tarifa = tarifa;
    }


    //------------------------------------------------------------------
    // GETTERS Y SETTERS
    //------------------------------------------------------------------

    public Fecha getFecha(){
        return this.fecha_Alta;
    }

    public String getNIF(){
        return this.NIF;
    }

}
