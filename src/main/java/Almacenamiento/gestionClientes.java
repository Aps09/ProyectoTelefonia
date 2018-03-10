package Almacenamiento;

import Cliente.Cliente;
import Interfaz.datosCliente;
import Tarifa.Tarifa;

import java.util.ArrayList;

public class gestionClientes {

    private Almacen almacen;

    //------------------------------------------------------------------
    // CONSTRUCTORES
    //------------------------------------------------------------------

    public gestionClientes (Almacen almacen){
        this.almacen = almacen;
    }

    //------------------------------------------------------------------
    // METODOS DE USO
    //------------------------------------------------------------------

    public void addCliente(){
        Cliente cliente = datosCliente.addCliente();
        almacen.addCliente(cliente);
    }

    public void deleteCliente(){
        String NIF = datosCliente.deleteCliente();
        almacen.deleteCliente(NIF);
    }

    public void getDatosCliente(){
        String NIF = datosCliente.getDatos();
        Cliente cliente = almacen.getCliente(NIF);
        if(cliente != null)
            cliente.toString();
    }

    public void CambiarTarifa(){
        String NIF = datosCliente.getNIFTarifa();
        int cant = datosCliente.getCantTarifa();
        Tarifa tarifa = new Tarifa(cant);
        Cliente cliente = almacen.getCliente(NIF);
        if(cliente != null)
            cliente.setTarifa(tarifa);
    }

    public void getDatosClientes(){
        ArrayList<Cliente> clientes = almacen.getClientes();
        for(Cliente cliente : clientes){
            System.out.print(cliente.getNombre() + "\n");
        }
    }

    public Almacen getAlmacen() {
        return almacen;
    }
}
