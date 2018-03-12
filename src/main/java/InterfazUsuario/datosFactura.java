package InterfazUsuario;


import java.util.Date;
import java.util.Scanner;

public class datosFactura {

    private static Scanner scan = new Scanner(System.in);

    // ----------------------------------------------------------
    // METODOS DE USO
    // ----------------------------------------------------------

    //METODOS DE EMITIR FACTURA

    public static String emitirFacturaNIF(){
        // NIF
        System.out.print("Indique el NIF del cliente que desea generar una factura: ");
        String NIF = scan.next();

        return NIF;
    }

    public static Date[] pedirFechas(){
        Date inicio;
        Date fin;

        System.out.print("Indique el día de la primera fecha: ");
        int dia = scan.nextInt();

        System.out.print("Indique el mes de la primera fecha: ");
        int mes = scan.nextInt();

        System.out.print("Indique el año de la primera fecha: ");
        int anyo = scan.nextInt();

        inicio = new Date(anyo,mes,dia);

        // --------------------------------------------
        System.out.print("Indique el día de la segunda fecha: ");
        dia = scan.nextInt();

        System.out.print("Indique el mes de la segunda fecha: ");
        mes = scan.nextInt();

        System.out.print("Indique el año de la segunda fecha: ");
        anyo = scan.nextInt();

        fin = new Date(anyo,mes,dia);


        Date[] rango = new Date[2];
        rango[0] = inicio;
        rango[1] = fin;
        return rango;
    }

    //METODOS DE RECUPERAR FACTURA

    public static int recuperarFacturaID(){

        // Código
        System.out.print("Indique el código de la factura que desea visualizar: ");
        int id = scan.nextInt();

        return id;
    }

    //METODOS DE RECUPERAR FACTURAS

    public static String recuperarFacturaClienteNIF(){

        // NIF
        System.out.println("Indique el NIF del cliente que desea ver sus facturas emitidas: ");
        String NIF = scan.next();

        return NIF;
    }
}
