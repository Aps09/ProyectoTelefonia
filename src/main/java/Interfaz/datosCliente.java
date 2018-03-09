package Interfaz;

import Cliente.Cliente;
import Cliente.Direccion;
import Fecha.Fecha;
import Tarifa.Tarifa;

import java.util.Date;
import java.util.Scanner;

public class datosCliente {

    private static Cliente cliente;

    public datosCliente(){
        this.cliente = null;
    }

    public static Cliente addCliente(){
        Scanner scan = new Scanner(System.in);

        // Nombre
        System.out.println("Indique el nombre del cliente: ");
        cliente.setNombre(scan.next());

        // NIF
        System.out.println("Indique el NIF del cliente: ");
        cliente.setNIF(scan.next());

        // Direccion
        Cliente.Direccion dir;

        System.out.println("Indique la calle donde vive el cliente: ");
        String calle = scan.next();

        System.out.println("Indiqueel número del portal del cliente: ");
        int num = scan.nextInt();

        System.out.println("Indique el piso donde vive el cliente: ");
        int piso = scan.nextInt();

        System.out.println("Indique la puerta donde vive el cliente: ");
        String puerta = scan.next();

        dir = new Direccion(calle,num,piso,puerta);
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




}
