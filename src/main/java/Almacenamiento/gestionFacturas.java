package Almacenamiento;

import Cliente.Cliente;
import Facturas.Factura;
import Facturas.Periodo;
import Fecha.Fecha;
import InterfazUsuario.datosFactura;
import Llamadas.Llamada;

import java.awt.peer.SystemTrayPeer;
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
        // Creamos todas las variables que nos ayudara a crear y organizar la factura
        Factura factura = new Factura();
        String NIF = datosFactura.emitirFacturaNIF();
        Fecha[] rango = datosFactura.pedirFechas();
        Periodo periodo = new Periodo(rango[0],rango[1]);
        Cliente cliente = almacen.getCliente(NIF);

        // Llamadas será la lista de llamadas que están en el intervalo proporcionado
        ArrayList<Llamada> llamadas = this.encontrarLlamadas(NIF,rango);

        // Calcular con las llamadas válidas
        double importe = 0;
        for(Llamada llamada : llamadas) {
            importe += cliente.getTarifa().getCantidad() * llamada.getDuracion();
        }

        // Crear factura
        Fecha fecha = datosFactura.getFechaEmision();
        factura.setFechaEmision(fecha);
        factura.setImporte(importe);
        factura.setPeriodo(periodo);
        factura.setTarifa(cliente.getTarifa());


        // Enviar al almacen la factura
        almacen.emitirFactura(NIF,factura);
    }

    public ArrayList<Llamada> encontrarLlamadas (String NIF, Fecha[] rango){
        // Recogemos las llamadas del cliente en cuestión
        ArrayList<Llamada> llamadas = almacen.getLlamadas(NIF);

        // Vamos comparando las fechas de cada llamada y comprobamos que se encuentren en el rango proporcionado
        ArrayList<Llamada> validas = new ArrayList<Llamada>();
        for(Llamada llamada : llamadas) {
            if (llamada.getFechaLlamada().compareTo(rango[0]) >= 0 && llamada.getFechaLlamada().compareTo(rango[1]) <= 0)
                validas.add(llamada);
        }

        // Devolvemos el conjunto de llamadas válidas
        return validas;
    }

    public void recuperarFactura(){
        // Mediante el id de la factura recuperamos la factura y la ponemos en pantalla
        int id = datosFactura.recuperarFacturaID();
        Factura factura = almacen.getFactura(id);
        System.out.println("\n");
        if(factura != null)
            System.out.print(factura.toString());
        System.out.println("\n");
    }

    public void recuperarFacturasCliente(){
        // Con el NIF del cliente buscamos sus facturas y las imprimimos por pantalla
        String NIF = datosFactura.recuperarFacturaClienteNIF();
        ArrayList<Factura> facturas = almacen.getFacturas(NIF);
        if(facturas != null){
            for(Factura factura : facturas) {
                System.out.println("\n");
                System.out.print(factura.toString());
            }
        }
        System.out.println("\n");
    }

    //------------------------------------------------------------------
    // GETTERS Y SETTERS
    //------------------------------------------------------------------

    public Almacen getAlmacen() {
        return this.almacen;
    }
}
