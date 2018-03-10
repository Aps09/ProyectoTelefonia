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
        // Llamamos a la interfaz donde se hacen las preguntas para crear el cliente y lo añadimos
        Cliente cliente = datosCliente.addCliente();
        almacen.addCliente(cliente);
    }

    public void deleteCliente(){
        // Llamamos a la interfaz donde se hacen las preguntas para detectar el NIF del cliente a borrar y lo borramos
        String NIF = datosCliente.deleteCliente();
        almacen.deleteCliente(NIF);
    }

    public void getDatosCliente(){
        // Llamamos a la interfaz donde se hacen preguntas para detectar el NIF del cliente
        String NIF = datosCliente.getDatos();
        // Recogemos al cliente y llamamos a su método toString.
        Cliente cliente = almacen.getCliente(NIF);
        if(cliente != null)
            cliente.toString();
    }

    public void CambiarTarifa(){
        // Llamamos a la interfaz para que saque el NIF del cliente y la nueva cantidad
        String NIF = datosCliente.getNIFTarifa();
        int cant = datosCliente.getCantTarifa();
        Tarifa tarifa = new Tarifa(cant);
        // Recogemos al cliente y le cambiamos la tarifa
        Cliente cliente = almacen.getCliente(NIF);
        if(cliente != null)
            cliente.setTarifa(tarifa);
    }

    public void getDatosClientes(){
        // Recogemos la lista de clientes y escribimos sus respectivos nombres
        ArrayList<Cliente> clientes = almacen.getClientes();
        for(Cliente cliente : clientes){
            System.out.print(cliente.getNombre() + "\n");
        }
    }

    //------------------------------------------------------------------
    // GETTERS Y SETTERS
    //------------------------------------------------------------------

    public Almacen getAlmacen() {
        return almacen;
    }
}
