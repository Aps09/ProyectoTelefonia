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
        System.out.println("MARQUE LOS ESPACIOS CON UN '_'");
        System.out.println(" ");

        // NIF cliente
        System.out.print("Indique el NIF del cliente que realizó la llamada: ");
        String NIF = scan.next();

        return NIF;
    }

    public static Llamada addLlamada(){
        Llamada llamada = new Llamada();

        // Número teléfono al que llamó
        System.out.print("Indique el número de teléfono al que realizó la llamada: ");
        String num = scan.next();
        llamada.setNumeroTelefono(num);

        // Fecha llamada
        System.out.print("Indique el día de la llamada: ");
        int dia = scan.nextInt();

        System.out.print("Indique el mes de la llamada: ");
        int mes = scan.nextInt();

        System.out.print("Indique el año de la llamada: ");
        int anyo = scan.nextInt();

        Fecha fecha = new Fecha(dia,mes,anyo);
        llamada.setFechaLlamada(fecha);

        // Duración llamada
        System.out.print("Indique la duración de dicha llamada: ");
        double dur = scan.nextDouble();
        llamada.setDuracion(dur);

        return llamada;
    }

    // ----------------------------------------------------------------------------
    // METODOS PARA LISTAR LLAMADAS
    // ----------------------------------------------------------------------------

    public static String listarLlamadas(){
        System.out.println("MARQUE LOS ESPACIOS CON UN '_'");
        System.out.println(" ");

        // NIF
        System.out.print("Indique el NIF del usuario que desea listar sus llamadas: ");
        String NIF = scan.next();

        return NIF;
    }

    // ----------------------------------------------------------------------------
    // METODOS GENERALIZACION
    // ----------------------------------------------------------------------------

    public static String getNIFEntreFechas(){
        System.out.println("MARQUE LOS ESPACIOS CON UN '_'");
        System.out.println(" ");

        // NIF
        System.out.print("Indique el NIF del usuario que desea listar sus llamadas: ");
        String NIF = scan.next();

        return NIF;
    }

    public static Fecha getFechaIni(){
        System.out.print("Indique el día de la primera fecha del periodo que quieres saber las llamadas del cliente: ");
        int dia = scan.nextInt();

        System.out.print("Indique el mes de la primera fecha del periodo que quieres saber las llamadas del cliente: ");
        int mes = scan.nextInt();

        System.out.print("Indique el año de la primera fecha del periodo que quieres saber las llamadas del cliente: ");
        int anyo = scan.nextInt();

        return new Fecha(dia,mes,anyo);
    }

    public static Fecha getFechaFin(){
        System.out.print("Indique el día de la primera fecha del periodo que quieres saber las llamadas del cliente: ");
        int dia = scan.nextInt();

        System.out.print("Indique el mes de la primera fecha del periodo que quieres saber las llamadas del cliente: ");
        int mes = scan.nextInt();

        System.out.print("Indique el año de la primera fecha del periodo que quieres saber las llamadas del cliente: ");
        int anyo = scan.nextInt();

        return new Fecha(dia,mes,anyo);
    }





}
