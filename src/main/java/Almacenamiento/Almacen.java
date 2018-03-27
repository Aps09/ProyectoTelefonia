package Almacenamiento;

import Cliente.Cliente;
import Facturas.Factura;
import Llamadas.Llamada;

import java.util.ArrayList;
import java.util.HashMap;

public class Almacen {

    private static int numCodigo = 0;

    private ArrayList<Cliente> clientes;
    private HashMap<String,ArrayList<Factura>> facturas;
    private HashMap<String,ArrayList<Llamada>> llamadas;

    //------------------------------------------------------------------
    // CONSTRUCTORES
    //------------------------------------------------------------------

    public Almacen(){
        // guardaremos las facturas y las llamadas en un mapa con clave el NIF del cliente
        this.facturas = new HashMap<String, ArrayList<Factura>>();
        this.llamadas = new HashMap<String, ArrayList<Llamada>>();
        this.clientes = new ArrayList<Cliente>();
    }

    //------------------------------------------------------------------
    // GESTION DE CLIENTES
    //------------------------------------------------------------------

    public void addCliente(Cliente cliente){
        // Añadimos un cliente a la lista de clientes y en cada lista de facturas y llamadas
        clientes.add(cliente);
        facturas.put(cliente.getNIF(), new ArrayList<Factura>());
        llamadas.put(cliente.getNIF(), new ArrayList<Llamada>());
    }

    public void deleteCliente(String NIF){
        // Lo buscamos en una lista y lo borramos en ambas
        for(int indice = 0; indice < clientes.size(); indice++){
            if(clientes.get(indice).getNIF().equals(NIF)) {
                clientes.remove(indice);
                break;
            }
        }
        // FInalmente borramos sus facturas y sus llamadas
        facturas.remove(NIF);
        llamadas.remove(NIF);
    }

    public Cliente getCliente(String NIF){
        // Como en el anterior, lo buscamos y lo enviamos
        for(Cliente cliente : clientes){
            if(cliente.getNIF().equals(NIF))
                return cliente;
        }
        return null;
    }

    public ArrayList<Cliente> getClientes(){
        // Simplemente devolvemos la lista de clientes que tenemos
        return clientes;
    }


    //------------------------------------------------------------------
    // GESTION LLAMADAS
    //------------------------------------------------------------------

    public void addLlamada(String NIF, Llamada llamada){
        // Añadimos la llamada a la lista de llamadas del cliente en cuestión
        llamadas.get(NIF).add(llamada);
    }

    public ArrayList<Llamada> getLlamadas(String NIF){
        // Devolvemos la lista de llamdas asociada al cliente en cuestión
        return this.llamadas.get(NIF);
    }

    //------------------------------------------------------------------
    // GESTION DE FACTURAS
    //------------------------------------------------------------------

    public void emitirFactura(String NIF, Factura factura) {
        // Modificamos el código de la factura y lo añadimos a la lista de facturas
        numCodigo++;
        factura.setCodigo(numCodigo);
        this.facturas.get(NIF).add(factura);
    }

    public Factura getFactura(int id){
        // Recorremos todas las facturas de todos los clientes hasta encontrar el código de la factura en cuestion
        for(String nif : facturas.keySet()){
            for(Factura factura : facturas.get(nif))
                if(factura.getCodigo() == id)
                    return factura;
        }
        return null;
    }

    public ArrayList<Factura> getFacturas(String NIF){
        // Devolvemos la lista de facturas asociadas al cliente
        return this.facturas.get(NIF);
    }

}