package Facturas;

import java.util.Date;

public class Periodo {
    Date inicio;
    Date fin;

    // -----------------------------------------------
    // CONSTRUCTORES
    // -----------------------------------------------

    public Periodo() {
        this.inicio = null;
        this.fin = null;
    }

    public Periodo (Date inicio, Date fin){
        this.inicio = inicio;
        this.fin = fin;
    }
}
