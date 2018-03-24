package Menu;

import Almacenamiento.Almacen;
import Almacenamiento.gestionLlamadas;

import java.util.Scanner;

public class MenuLlamadas {

    public static Almacen main (Almacen almacen){
        gestionLlamadas gestion = new gestionLlamadas(almacen);
        opcionesLlamadas[] menu = opcionesLlamadas.values();
        Scanner scan = new Scanner(System.in);
        int opc;

        // Mostramos menú
        do{
            System.out.println("");
            for (opcionesLlamadas m : menu) {
                System.out.printf("%d) %s%n", m.ordinal() + 1, m.name());
            }

            System.out.print("Elija una opción: ");
            opc = scan.nextInt();

            switch(opc){
                case 1:
                    // Añadir llamada
                    gestion.addLlamada();
                    break;
                case 2:
                    // Listar llamadas
                    gestion.listarLlamadas();
                    break;
                case 3:
                    // Listar llamadas entre fechas
                    gestion.ListarLlamadasEntreFechas();
                    break;
            }
        }while (opc != 4);

        almacen = gestion.getAlmacen();
        return almacen;
    }
}
