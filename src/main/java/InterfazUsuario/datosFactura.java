package InterfazUsuario;


import Fecha.Fecha;

import java.util.Scanner;

public class datosFactura {

    private static Scanner scan = new Scanner(System.in);

    // ----------------------------------------------------------
    // METODOS DE USO
    // ----------------------------------------------------------

    // ----------------------------------------------------------------------------
    //METODOS DE EMITIR FACTURA
    // ----------------------------------------------------------------------------

    public static String emitirFacturaNIF(){
        System.out.println("MARQUE LOS ESPACIOS CON UN '_'");
        System.out.println(" ");

        // NIF
        System.out.print("Indique el NIF del cliente que desea generar una factura: ");
        String NIF = scan.next();

        return NIF;
    }

    public static Fecha getFechaEmision(){

        System.out.print("Indique el día de emisión de la factura: ");
        int dia = scan.nextInt();

        System.out.print("Indique el mes de emisión de la factura: ");
        int mes = scan.nextInt();

        System.out.print("Indique el año de emisión de la factura: ");
        int anyo = scan.nextInt();

        Fecha fecha = new Fecha(dia,mes,anyo);
        return fecha;
    }

    public static Fecha[] pedirFechas(){
        Fecha inicio;
        Fecha fin;

        System.out.print("Indique el día de la primera fecha: ");
        int dia = scan.nextInt();

        System.out.print("Indique el mes de la primera fecha: ");
        int mes = scan.nextInt();

        System.out.print("Indique el año de la primera fecha: ");
        int anyo = scan.nextInt();

        inicio = new Fecha(dia,mes,anyo);

        // --------------------------------------------
        System.out.print("Indique el día de la segunda fecha: ");
        dia = scan.nextInt();

        System.out.print("Indique el mes de la segunda fecha: ");
        mes = scan.nextInt();

        System.out.print("Indique el año de la segunda fecha: ");
        anyo = scan.nextInt();

        fin = new Fecha(dia,mes,anyo);


        Fecha[] rango = new Fecha[2];
        rango[0] = inicio;
        rango[1] = fin;
        return rango;
    }

    // ----------------------------------------------------------------------------
    //METODOS DE RECUPERAR UNA SOLA FACTURA
    // ----------------------------------------------------------------------------

    public static int recuperarFacturaID(){
        System.out.println("MARQUE LOS ESPACIOS CON UN '_'");
        System.out.println(" ");

        // Código
        System.out.print("Indique el código de la factura que desea visualizar: ");
        int id = scan.nextInt();

        return id;
    }

    // ----------------------------------------------------------------------------
    //METODOS DE RECUPERAR TODAS LAS FACTURAS
    // ----------------------------------------------------------------------------

    public static String recuperarFacturaClienteNIF(){
        System.out.println("MARQUE LOS ESPACIOS CON UN '_'");
        System.out.println(" ");

        // NIF
        System.out.print("Indique el NIF del cliente que desea ver sus facturas emitidas: ");
        String NIF = scan.next();

        return NIF;
    }

    // ----------------------------------------------------------------------------
    // METODOS GENERALIZACION
    // ----------------------------------------------------------------------------

    public static String getNIFEntreFechas(){
        System.out.println("MARQUE LOS ESPACIOS CON UN '_' ");

        System.out.print("Indique el NIF del cliente del que quieres recuperar las facturas: ");
        String NIF = scan.next();

        return NIF;
    }

    public static Fecha getFechaInicial(){
        System.out.print("Indique el día de la primera fecha del periodo que quieres saber las facturas del cliente: ");
        int dia = scan.nextInt();

        System.out.print("Indique el mes de la primera fecha del periodo que quieres saber las facturas del cliente: ");
        int mes = scan.nextInt();

        System.out.print("Indique el año de la primera fecha del periodo que quieres saber las facturas del cliente: ");
        int anyo = scan.nextInt();

        return new Fecha(dia,mes,anyo);
    }

    public static Fecha getFechaFinal(){
        System.out.print("Indique el día de la primera fecha del periodo que quieres saber las facturas del cliente: ");
        int dia = scan.nextInt();

        System.out.print("Indique el mes de la primera fecha del periodo que quieres saber las facturas del cliente: ");
        int mes = scan.nextInt();

        System.out.print("Indique el año de la primera fecha del periodo que quieres saber las facturas del cliente: ");
        int anyo = scan.nextInt();

        return new Fecha(dia,mes,anyo);
    }
}
