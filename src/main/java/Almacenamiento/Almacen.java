package Almacenamiento;

import Cliente.Cliente;
import Facturas.Factura;
import Llamadas.Llamada;
import com.sun.deploy.util.SessionState;

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
        // Recorremos los clientes y le añadimos la llamada a la lista
        for(Cliente cliente : llamadas.keySet()){
            if(cliente.getNIF().equals(NIF))
                llamadas.get(cliente).add(llamada);
        }
    }

    public ArrayList<Llamada> getLlamadas(String NIF){
        // Recorremos la lista de clientes y devolvemos sus llamadas
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

    public Factura getFactura(String id){
        // Recorremos los clientes y cogemos la factura que tenga el codigo
        for (Cliente cliente : facturas.keySet()){
            for (Factura factura : facturas.get(cliente)){
                if(factura.getCodigo().equals(id))
                    return factura;
            }
        }
        return null;
    }

    public ArrayList<Factura> getFacturas(String NIF){
        // Recorremos los clientes y mandamos la lista de facturas que pertenezca al cliente
        for(Cliente cliente : facturas.keySet()){
            if(cliente.getNIF().equals(NIF))
                return facturas.get(cliente);
        }
        return null;
    }

}
