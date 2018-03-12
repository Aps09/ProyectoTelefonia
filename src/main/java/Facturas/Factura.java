package Facturas;

import Tarifa.Tarifa;

import java.util.Date;

public class Factura {

    private String codigo;
    private Tarifa tarifa;
    private Date fechaEmision;
    private Periodo periodo;
    private int importe;

    //------------------------------------------------------------------
    // CONSTRUCTORES
    //------------------------------------------------------------------

    public Factura(){
        this.codigo = null;
        this.tarifa = new Tarifa();
        this.fechaEmision = null;
        this.periodo = new Periodo();
        this.importe = -1;
    }

    public Factura(String codigo, Tarifa tarifa, Date fechaEmision, Periodo periodo, int importe){
        this.codigo = codigo;
        this.tarifa = tarifa;
        this.fechaEmision = fechaEmision;
        this.periodo = periodo;
        this.importe = importe;
    }


    //------------------------------------------------------------------
    // GETTERS
    //------------------------------------------------------------------

    public String getCodigo() {
        return codigo;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public int getImporte() {
        return importe;
    }

    //------------------------------------------------------------------
    // SETTERS
    //------------------------------------------------------------------

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    //------------------------------------------------------------------
    // TO STRING
    //------------------------------------------------------------------

    public String toString() {

        String mensaje = "Código: "+this.codigo + "\n"+
                "Tarifa: "+this.tarifa.getCantidad() + "€/min \n" +
                "Fecha: "+ this.getFechaEmision() + "\n" +
                "Periodo: " + this.periodo.getInicio() + " - " + this.periodo.getFin() + "\n" +
                "Importe: " + this.getImporte();

        return mensaje;
    }
}
