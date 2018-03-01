package Almacenamiento;

import Cliente.Cliente;
import Cliente.Direccion;
import Fecha.Fecha;
import Tarifa.Tarifa;

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

    public void addCliente(String nombre, String NIF, Direccion direccion, String correo, Fecha fecha, Tarifa tarifa){
        Cliente cliente = new Cliente(nombre, NIF, direccion, correo, fecha, tarifa);
        almacen.addCliente(cliente);
    }

    public void deleteCliente(String NIF){
        almacen.deleteCliente(NIF);
    }

    public void getDatosCliente(String NIF){

    }

    public void getDatosClientes(){

    }
}
