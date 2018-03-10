package Interfaz;

import Llamadas.Llamada;

import java.util.Date;
import java.util.Scanner;

public class datosLlamada {

    private static Scanner scan = new Scanner(System.in);

    public static String addLlamadaNIF(){

        // NIF cliente
        System.out.println("Indique el NIF del cliente que realizó la llamada: ");
        String NIF = scan.next();

        return NIF;
    }

    public static Llamada addLlamada(){
        Llamada llamada = new Llamada();

        // Número teléfono al que llamó
        System.out.println("Indique el número de teléfono al que realizó la llamada: ");
        String num = scan.next();
        llamada.setNumeroTelefono(num);

        // Fecha llamada
        Date fecha = new Date();
        llamada.setFechaLlamada(fecha);

        // Duración llamada
        System.out.println("Indique la duración de dicha llamada: ");
        double dur = scan.nextDouble();
        llamada.setDuracion(dur);

        return llamada;
    }

    public static String listarLlamadas(){
        System.out.println("Indique el NIF del usuario que desea listar sus llamadas: ");
        String NIF = scan.next();

        return NIF;
    }
}
