package Llamadas;

import java.util.Date;

public class Llamada {

    private String numeroTelefono;
    private Date fechaLlamada;
    private double duracion;

    //------------------------------------------------------------------
    // CONSTRUCTORES
    //------------------------------------------------------------------

    public Llamada(){
        this.numeroTelefono = null;
        this.fechaLlamada = null;
        this.duracion = -1;
    }

    public Llamada(String numeroTelefono, Date fecha, double duracion){
        this.numeroTelefono = numeroTelefono;
        this.fechaLlamada = fecha;
        this.duracion = duracion;
    }


    //------------------------------------------------------------------
    // METODOS DE USO
    //------------------------------------------------------------------



    //------------------------------------------------------------------
    // GETTERS
    //------------------------------------------------------------------

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public Date getFechaLlamada() {
        return fechaLlamada;
    }

    public double getDuracion() {
        return duracion;
    }


    //------------------------------------------------------------------
    // SETTERS
    //------------------------------------------------------------------

    public void setFechaLlamada(Date fechaLlamada) {
        this.fechaLlamada = fechaLlamada;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}
