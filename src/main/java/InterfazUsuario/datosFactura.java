package InterfazUsuario;


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

    //METODOS DE RECUPERAR FACTURA

    public static String recuperarFacturaID(){

        // Código
        System.out.print("Indique el código de la factura que desea visualizar: ");
        String id = scan.next();

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
