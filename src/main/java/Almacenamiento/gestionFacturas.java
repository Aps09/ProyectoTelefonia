package Almacenamiento;

import Facturas.Factura;
import InterfazUsuario.datosFactura;

import java.util.ArrayList;

public class gestionFacturas {

    private Almacen almacen;

    //------------------------------------------------------------------
    // CONSTRUCTORES
    //------------------------------------------------------------------

    public gestionFacturas (Almacen almacen){
        this.almacen = almacen;
    }

    //------------------------------------------------------------------
    // METODOS DE USO
    //------------------------------------------------------------------

    public void emitirFactura(){
        // duracion de las llamadas de un cliente * tarifa contratada


    }

    public void recuperarFactura(){
        String id = datosFactura.recuperarFacturaID();
        Factura factura = almacen.getFactura(id);
        if(factura != null)
            System.out.print(factura.toString());
    }

    public void recuperarFacturasCliente(){
        String NIF = datosFactura.recuperarFacturaClienteNIF();
        ArrayList<Factura> facturas = almacen.getFacturas(NIF);
        if(facturas != null){
            for(Factura factura : facturas) {
                System.out.println("");
                System.out.print("Código: " + factura.getCodigo() + "\n" +
                        "Importe: " + factura.getImporte());
            }
        }
    }

    //------------------------------------------------------------------
    // GETTERS Y SETTERS
    //------------------------------------------------------------------

    public Almacen getAlmacen() {
        return this.almacen;
    }
}
