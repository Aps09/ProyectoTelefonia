package InterfazUsuario;

import Cliente.Cliente;
import Cliente.Direccion;
import Fecha.Fecha;
import Tarifa.Tarifa;
import java.util.Scanner;

public class datosCliente {

    private static Scanner scan = new Scanner(System.in);

    // ----------------------------------------------------------
    // METODOS DE USO
    // ----------------------------------------------------------

    public static Cliente addCliente(){
        Cliente cliente = new Cliente();

        System.out.println("MARQUE LOS ESPACIOS CON UN '_'");
        System.out.println(" ");

        // Nombre
        System.out.print("Indique el nombre del cliente: ");
        cliente.setNombre(scan.next());

        // NIF
        System.out.print("Indique el NIF del cliente: ");
        cliente.setNIF(scan.next());

        // Direccion
        Direccion dir;

        System.out.print("Indique la provincia en la que habita el cliente: ");
        String provincia = scan.next();

        System.out.print("Indique la calle donde vive el cliente: ");
        String calle = scan.next();

        System.out.print("Indique el número del portal del cliente: ");
        int num = scan.nextInt();

        System.out.print("Indique el piso donde vive el cliente: ");
        int piso = scan.nextInt();

        System.out.print("Indique la puerta donde vive el cliente: ");
        String puerta = scan.next();

        dir = new Direccion(provincia,calle,num,piso,puerta);
        cliente.setDireccion(dir);

        // Correo
        System.out.print("Indique el correo del cliente: ");
        cliente.setCorreo(scan.next());

        // Fecha de alta
        System.out.print("Indique el día de registro: ");
        int dia = scan.nextInt();

        System.out.print("Indique el mes de registro: ");
        int mes = scan.nextInt();

        System.out.print("Indique el año de registro: ");
        int anyo = scan.nextInt();

        Fecha fecha = new Fecha(dia,mes,anyo);
        cliente.setFecha(fecha);

        // Tarifa
        System.out.print("Indique la cantidad que paga con la tarifa actual: ");
        cliente.setTarifa(new Tarifa(scan.nextInt()));

        return cliente;
    }

    public static String deleteCliente(){
        System.out.println("MARQUE LOS ESPACIOS CON UN '_'");
        System.out.println(" ");

        // NIF
        System.out.print("Indique el NIF del cliente que quiere borrar: ");
        String NIF = scan.next();

        return NIF;
    }

    public static String getDatos(){
        System.out.println("MARQUE LOS ESPACIOS CON UN '_'");
        System.out.println(" ");

        // NIF
        System.out.print("Indique el NIF del cliente que quieras recoger los datos: ");
        String NIF = scan.next();

        return NIF;
    }

    public static String getNIFTarifa(){
        System.out.println("MARQUE LOS ESPACIOS CON UN '_'");
        System.out.println(" ");

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
