package Almacenamiento;

import Cliente.Cliente;
import Interfaz.datosCliente;

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

    public void deleteCliente(String NIF){
        almacen.deleteCliente(NIF);
    }

    public void getDatosCliente(String NIF){

    }

    public void getDatosClientes(){

    }

    public Almacen getAlmacen() {
        return almacen;
    }
}
