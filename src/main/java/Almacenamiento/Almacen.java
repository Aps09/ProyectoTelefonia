package Almacenamiento;

import Cliente.Cliente;
import Facturas.Factura;
import Llamadas.Llamada;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Almacen {

    private HashMap<Cliente,ArrayList<Factura>> facturas;
    private HashMap<Cliente,ArrayList<Llamada>> llamadas;

    //------------------------------------------------------------------
    // CONSTRUCTORES
    //------------------------------------------------------------------

    public Almacen(){
        this.facturas = new HashMap<Cliente, ArrayList<Factura>>();
        this.llamadas = new HashMap<Cliente, ArrayList<Llamada>>();
    }

    public Almacen(HashMap<Cliente,ArrayList<Factura>> facturas, HashMap<Cliente,ArrayList<Llamada>>llamdas){
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

    public void addLlamada(String NIF, Llamada llamada){
        for(Cliente cliente : llamadas.keySet()){
            if(cliente.getNIF().equals(NIF))
                llamadas.get(cliente).add(llamada);
        }
    }

    public ArrayList<Llamada> getLlamadas(String NIF){
        for(Cliente cliente : llamadas.keySet()){
            if(cliente.getNIF().equals(NIF))
                return this.llamadas.get(cliente);
        }
        return null;
    }

    //------------------------------------------------------------------
    // GESTION DE FACTURAS
    //------------------------------------------------------------------

    public void emitirFactura() {

    }

    public Factura getFactura(){

    }

    public List<Factura> getFacturas(){

    }

}
