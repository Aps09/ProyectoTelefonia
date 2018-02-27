package Llamadas;

import Fecha.Fecha;

public class Llamada {

    private int numeroTelefono;
    private Fecha fechaLlamada;
    private double duracion;

    //------------------------------------------------------------------
    // CONSTRUCTORES
    //------------------------------------------------------------------

    public Llamada(){
        this.numeroTelefono = 0;
        this.fechaLlamada = null;
        this.duracion = -1;
    }

    public Llamada(int numeroTelefono, Fecha fecha, double duracion){
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
