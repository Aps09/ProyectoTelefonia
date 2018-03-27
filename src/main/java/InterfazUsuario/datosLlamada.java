package InterfazUsuario;

import Fecha.Fecha;
import Llamadas.Llamada;

import java.util.Scanner;

public class datosLlamada {

    private static Scanner scan = new Scanner(System.in);

    // ----------------------------------------------------------------------------
    // METODOS DE USO
    // ----------------------------------------------------------------------------


    // ----------------------------------------------------------------------------
    // METODOS AÑADIR LLAMADA
    // ----------------------------------------------------------------------------

    public static String addLlamadaNIF(){

        System.out.println(" ");

        // NIF cliente
        System.out.print("Indique el NIF del cliente que realizó la llamada: ");
        return scan.nextLine();
    }

    public static Llamada addLlamada(){
        Llamada llamada = new Llamada();

        // Número teléfono al que llamó
        System.out.print("Indique el número de teléfono al que realizó la llamada: ");
        llamada.setNumeroTelefono(scan.nextLine());

        // Fecha llamada
        System.out.print("Indique el día de la llamada: ");
        int dia = Integer.parseInt(scan.nextLine());

        System.out.print("Indique el mes de la llamada: ");
        int mes = Integer.parseInt(scan.nextLine());

        System.out.print("Indique el año de la llamada: ");
        int anyo = Integer.parseInt(scan.nextLine());

        Fecha fecha = new Fecha(dia,mes,anyo);
        llamada.setFechaLlamada(fecha);

        // Duración llamada
        System.out.print("Indique la duración de dicha llamada: ");
        double dur = Double.parseDouble(scan.nextLine());
        llamada.setDuracion(dur);

        return llamada;
    }

    // ----------------------------------------------------------------------------
    // METODOS PARA LISTAR LLAMADAS
    // ----------------------------------------------------------------------------

    public static String listarLlamadas(){

        System.out.println(" ");

        // NIF
        System.out.print("Indique el NIF del usuario que desea listar sus llamadas: ");
        return scan.nextLine();
    }

    // ----------------------------------------------------------------------------
    // METODOS GENERALIZACION
    // ----------------------------------------------------------------------------

    public static String getNIFEntreFechas(){

        System.out.println(" ");

        // NIF
        System.out.print("Indique el NIF del usuario que desea listar sus llamadas: ");
        return scan.nextLine();
    }

    public static Fecha getFechaIni(){
        System.out.print("Indique el día de la primera fecha del periodo que quieres saber las llamadas del cliente: ");
        int dia = Integer.parseInt(scan.nextLine());

        System.out.print("Indique el mes de la primera fecha del periodo que quieres saber las llamadas del cliente: ");
        int mes = Integer.parseInt(scan.nextLine());

        System.out.print("Indique el año de la primera fecha del periodo que quieres saber las llamadas del cliente: ");
        int anyo = Integer.parseInt(scan.nextLine());

        return new Fecha(dia,mes,anyo);
    }

    public static Fecha getFechaFin(){
        System.out.print("Indique el día de la primera fecha del periodo que quieres saber las llamadas del cliente: ");
        int dia = Integer.parseInt(scan.nextLine());

        System.out.print("Indique el mes de la primera fecha del periodo que quieres saber las llamadas del cliente: ");
        int mes = Integer.parseInt(scan.nextLine());

        System.out.print("Indique el año de la primera fecha del periodo que quieres saber las llamadas del cliente: ");
        int anyo = Integer.parseInt(scan.nextLine());

        return new Fecha(dia,mes,anyo);
    }
}