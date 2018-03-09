package Cliente;

import Tarifa.Tarifa;

import java.util.Date;

public class Cliente {

    private String nombre;
    private String NIF;
    private Direccion direccion;
    private String correo;
    private Date fecha_Alta;
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

    public Cliente(String nombre, String NIF, Direccion direccion, String correo, Tarifa tarifa){
        this.nombre = nombre;
        this.NIF = NIF;
        this.direccion = direccion;
        this.correo = correo;
        this.fecha_Alta = new Date();
        this.tarifa = tarifa;
    }


    //------------------------------------------------------------------
    // GETTERS Y SETTERS
    //------------------------------------------------------------------

    public Date getFecha(){
        return this.fecha_Alta;
    }

    public String getNIF(){
        return this.NIF;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setFecha_Alta(Date fecha_Alta) {
        this.fecha_Alta = fecha_Alta;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

}
