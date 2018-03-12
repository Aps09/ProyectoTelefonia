package Almacenamiento;

import InterfazUsuario.datosLlamada;
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
        // Recogemos el NIF del usuario y creamos la llamada y la pasamos al almacen
        String NIF = datosLlamada.addLlamadaNIF();
        Llamada llamada = datosLlamada.addLlamada();
        this.almacen.addLlamada(NIF,llamada);
    }

    public void listarLlamadas(){
        // Recogemos el NIF del cliente y mostramos las llamadas
        String NIF = datosLlamada.listarLlamadas();
        ArrayList<Llamada> llamadas = this.almacen.getLlamadas(NIF);
        for(Llamada llamada : llamadas) {
            System.out.print(llamada.toString());
            System.out.println("\n");
        }
    }

    //------------------------------------------------------------------
    // GETTERS Y SETTERS
    //------------------------------------------------------------------

    public Almacen getAlmacen() {
        return this.almacen;
    }
}
