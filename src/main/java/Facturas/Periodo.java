package Facturas;

import Fecha.Fecha;


public class Periodo {
    private Fecha inicio;
    private Fecha fin;

    // -----------------------------------------------
    // CONSTRUCTORES
    // -----------------------------------------------

    Periodo() {
        this.inicio = null;
        this.fin = null;
    }

    public Periodo (Fecha inicio, Fecha fin){
        this.inicio = inicio;
        this.fin = fin;
    }

    // -------------------------------------------------
    // GETTERS
    // -------------------------------------------------

    public Fecha getInicio() {
        return inicio;
    }

    public Fecha getFin() {
        return fin;
    }
}
