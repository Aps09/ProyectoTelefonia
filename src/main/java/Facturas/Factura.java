package Facturas;

import Fecha.Fecha;
import Tarifa.Tarifa;

public class Factura {

    private int codigo;
    private Tarifa tarifa;
    private Fecha fechaEmision;
    private Periodo periodo;
    private double importe;

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
    // GETTERS
    //------------------------------------------------------------------

    public int getCodigo() {
        return codigo;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public Fecha getFechaEmision() {
        return fechaEmision;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public double getImporte() {
        return importe;
    }

    //------------------------------------------------------------------
    // SETTERS
    //------------------------------------------------------------------

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    public void setFechaEmision(Fecha fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    //------------------------------------------------------------------
    // TO STRING
    //------------------------------------------------------------------

    public String toString() {

        String mensaje = "Código: "+this.codigo + "\n"+
                "Tarifa: "+this.tarifa.getCantidad() + "€/min \n" +
                "Fecha: "+ this.getFechaEmision().toString() + "\n" +
                "Periodo: " + this.periodo.getInicio() + " - " + this.periodo.getFin() + "\n" +
                "Importe: " + this.getImporte();

        return mensaje;
    }
}
