package Almacenamiento;

import Cliente.Cliente;
import Facturas.Factura;
import Llamadas.Llamada;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Almacen {

    private HashMap<Cliente,List<Factura>> facturas;
    private HashMap<Cliente,List<Llamada>> llamadas;

    //------------------------------------------------------------------
    // CONSTRUCTORES
    //------------------------------------------------------------------

    public Almacen(){
        this.facturas = new HashMap<Cliente, List<Factura>>();
        this.llamadas = new HashMap<Cliente, List<Llamada>>();
    }

    public Almacen(HashMap<Cliente,List<Factura>> facturas, HashMap<Cliente,List<Llamada>>llamdas){
        this.facturas = facturas;
        this.llamadas = llamdas;
    }

    //------------------------------------------------------------------
    // GESTION DE CLIENTES
    //------------------------------------------------------------------

    public void addCliente(Cliente cliente){
        // Añadimos un cliente en cada lista de facturas y llamadas
        facturas.put(cliente, new ArrayList<Factura>());
        llamadas.put(cliente, new ArrayList<Llamada>());
    }

    public void deleteCliente(String NIF){
        // Lo buscamos en una lista y lo borramos en ambas
        for(Cliente cliente : facturas.keySet()){
            if(cliente.getNIF().equals(NIF)){
                facturas.remove(cliente);
                llamadas.remove(cliente);
                break;
            }
        }
    }

    public Cliente getCliente(String NIF){
        // Como en el anterior, lo buscamos y lo enviamos
        for(Cliente cliente : facturas.keySet()){
            if(cliente.getNIF().equals(NIF))
                return cliente;
        }
        return null;
    }

    public ArrayList<Cliente> getClientes(){
        // Vamos añadiendo cada cliente a una lista que será nuestro resultado
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        for(Cliente cliente : facturas.keySet())
            listaClientes.add(cliente);
        return listaClientes;
    }


    //------------------------------------------------------------------
    // GESTION LLAMADAS
    //------------------------------------------------------------------

    public void addLlamada(Cliente cliente){

    }

    public List<Llamada> getLlamadas(Cliente cliente){
        return new ArrayList<Llamada>();
    }

    //------------------------------------------------------------------
    // GESTION DE FACTURAS
    //------------------------------------------------------------------

    public void addFactura() {

    }

    public Factura getFactura(){
        return new Factura();
    }

    public List<Factura> getFacturas(Cliente cliente){
        return new ArrayList<Factura>();
    }

}
