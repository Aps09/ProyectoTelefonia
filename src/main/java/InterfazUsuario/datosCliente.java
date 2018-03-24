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

    // ----------------------------------------------------------------------------
    // METODOS AÑADIR CLIENTE
    // ----------------------------------------------------------------------------

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

    // ----------------------------------------------------------------------------
    // METODOS ELIMINAR CLIENTE
    // ----------------------------------------------------------------------------

    public static String deleteCliente(){
        System.out.println("MARQUE LOS ESPACIOS CON UN '_'");
        System.out.println(" ");

        // NIF
        System.out.print("Indique el NIF del cliente que quiere borrar: ");
        String NIF = scan.next();

        return NIF;
    }

    // ----------------------------------------------------------------------------
    // METODOS RECOGER DATOS CLIENTE
    // ----------------------------------------------------------------------------

    public static String getDatos(){
        System.out.println("MARQUE LOS ESPACIOS CON UN '_'");
        System.out.println(" ");

        // NIF
        System.out.print("Indique el NIF del cliente que quieras recoger los datos: ");
        String NIF = scan.next();

        return NIF;
    }

    // ----------------------------------------------------------------------------
    // METODOS CAMBIAR TARIFA
    // ----------------------------------------------------------------------------

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

    // ----------------------------------------------------------------------------
    // METODOS ENTRE FECHAS
    // ----------------------------------------------------------------------------

    public static Fecha getFechaIni(){
        System.out.print("Indique el día de la primera fecha del periodo que quieres saber los clientes registrados: ");
        int dia = scan.nextInt();

        System.out.print("Indique el mes de la primera fecha del periodo que quieres saber los clientes registrados: ");
        int mes = scan.nextInt();

        System.out.print("Indique el año de la primera fecha del periodo que quieres saber los clientes registrados: ");
        int anyo = scan.nextInt();

        return new Fecha(dia,mes,anyo);
    }

    public static Fecha getFechaFin(){
        System.out.print("Indique el día de la segunda fecha del periodo que quieres saber los clientes registrados: ");
        int dia = scan.nextInt();

        System.out.print("Indique el mes de la segunda fecha del periodo que quieres saber los clientes registrados: ");
        int mes = scan.nextInt();

        System.out.print("Indique el año de la segunda fecha del periodo que quieres saber los clientes registrados: ");
        int anyo = scan.nextInt();

        return new Fecha(dia,mes,anyo);
    }
}
