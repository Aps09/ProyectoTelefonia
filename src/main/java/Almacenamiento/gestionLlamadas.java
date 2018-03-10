package Almacenamiento;

import Interfaz.datosLlamada;
import Llamadas.Llamada;

import java.util.ArrayList;

public class gestionLlamadas {

    private Almacen almacen;

    //------------------------------------------------------------------
    // CONSTRUCTORES
    //------------------------------------------------------------------

    public gestionLlamadas (Almacen almacen){
        this.almacen = almacen;
    }

    //------------------------------------------------------------------
    // METODOS DE USO
    //------------------------------------------------------------------

    public void addLlamada(){
        String NIF = datosLlamada.addLlamadaNIF();
        Llamada llamada = datosLlamada.addLlamada();
        this.almacen.addLlamada(NIF,llamada);
    }

    public void listarLlamadas(){
        String NIF = datosLlamada.listarLlamadas();
        ArrayList<Llamada> llamadas = this.almacen.getLlamadas(NIF);
        for(Llamada llamada : llamadas)
            System.out.println(NIF +", "+ llamada.getNumeroTelefono()+", "+llamada.getFechaLlamada() + ", "+llamada.getDuracion()+ "\n");
    }

    //------------------------------------------------------------------
    // GETTERS Y SETTERS
    //------------------------------------------------------------------

    public Almacen getAlmacen() {
        return this.almacen;
    }
}
