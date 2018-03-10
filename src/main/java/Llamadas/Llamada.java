package Llamadas;

import java.util.Date;

public class Llamada {

    private int numeroTelefono;
    private Date fechaLlamada;
    private double duracion;

    //------------------------------------------------------------------
    // CONSTRUCTORES
    //------------------------------------------------------------------

    public Llamada(){
        this.numeroTelefono = 0;
        this.fechaLlamada = null;
        this.duracion = -1;
    }

    public Llamada(int numeroTelefono, Date fecha, double duracion){
        this.numeroTelefono = numeroTelefono;
        this.fechaLlamada = fecha;
        this.duracion = duracion;
    }


    //------------------------------------------------------------------
    // METODOS DE USO
    //------------------------------------------------------------------



    //------------------------------------------------------------------
    // GETTERS Y SETTERS
    //------------------------------------------------------------------






}
