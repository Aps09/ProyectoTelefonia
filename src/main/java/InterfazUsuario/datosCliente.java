package InterfazUsuario;

import Cliente.Cliente;
import Cliente.Direccion;
import Tarifa.Tarifa;

import java.util.Date;
import java.util.Scanner;

public class datosCliente {

    private static Scanner scan = new Scanner(System.in);

    // ----------------------------------------------------------
    // METODOS DE USO
    // ----------------------------------------------------------

    public static Cliente addCliente(){
        Cliente cliente = new Cliente();

        // Nombre
        System.out.println("Indique el nombre del cliente: ");
        cliente.setNombre(scan.next());

        // NIF
        System.out.println("Indique el NIF del cliente: ");
        cliente.setNIF(scan.next());

        // Direccion
        Direccion dir;

        System.out.println("Indique la provincia en la que habita el cliente: ");
        String provincia = scan.next();

        System.out.println("Indique la calle donde vive el cliente: ");
        String calle = scan.next();

        System.out.println("Indique el número del portal del cliente: ");
        int num = scan.nextInt();

        System.out.println("Indique el piso donde vive el cliente: ");
        int piso = scan.nextInt();

        System.out.println("Indique la puerta donde vive el cliente: ");
        String puerta = scan.next();

        dir = new Direccion(provincia,calle,num,piso,puerta);
        cliente.setDireccion(dir);

        // Correo
        System.out.println("Indique el correo del cliente: ");
        cliente.setCorreo(scan.next());

        // Fecha de alta
        Date fecha = new Date();
        cliente.setFecha_Alta(fecha);

        // Tarifa
        System.out.println("Indique la cantidad que paga con la tarifa actual: ");
        cliente.setTarifa(new Tarifa(scan.nextInt()));

        return cliente;
    }

    public static String deleteCliente(){

        // NIF
        System.out.println("Indique el NIF del cliente que quiere borrar: ");
        String NIF = scan.next();

        return NIF;
    }

    public static String getDatos(){

        // NIF
        System.out.println("Indique el NIF del cliente que quieras recoger los datos: ");
        String NIF = scan.next();

        return NIF;
    }

    public static String getNIFTarifa(){

        // NIF
        System.out.print("Indique el NIF del cliente que quiera cambiar la tarifa: ");
        String NIF = scan.next();

        return NIF;
    }

    public static int getCantTarifa(){

        // CANTIDAD
        System.out.print("Indique la cantidad con la que quiere actualizar la tarifa: ");
        int cant = scan.nextInt();

        return cant;
    }


}
