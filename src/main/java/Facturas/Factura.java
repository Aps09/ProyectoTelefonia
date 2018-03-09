package Facturas;

import Tarifa.Tarifa;

public class Factura {

    private int codigo;
    private Tarifa tarifa;
    private Fecha fechaEmision;
    private Periodo periodo;
    private int importe;

    //------------------------------------------------------------------
    // CONSTRUCTORES
    //------------------------------------------------------------------

    public Factura(){
        this.codigo = -1;
        this.tarifa = new Tarifa();
        this.fechaEmision = null;
        this.periodo = new Periodo();
        this.importe = -1;
    }

    public Factura(int codigo, Tarifa tarifa, Fecha fechaEmision, Periodo periodo, int importe){
        this.codigo = codigo;
        this.tarifa = tarifa;
        this.fechaEmision = fechaEmision;
        this.periodo = periodo;
        this.importe = importe;
    }


    //------------------------------------------------------------------
    // GETTERS Y SETTERS
    //------------------------------------------------------------------





}
