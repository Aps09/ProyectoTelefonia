package Menu;

import Almacenamiento.Almacen;
import Almacenamiento.gestionClientes;

import java.util.Scanner;

public class MenuClientes extends MenuPrincipal {

    public static Almacen main (Almacen almacen){
        gestionClientes gestion = new gestionClientes(almacen);

        opcionesCliente[] menu = opcionesCliente.values();
        Scanner scan = new Scanner(System.in);
        int opc = 1;

        // Mostramos menu
        while(opc != 6){

            for (opcionesCliente m : menu) {
                System.out.printf("%d) %s%n", m.ordinal() + 1, m.name());
            }

            System.out.println("Elija una opción: ");
            opc = scan.nextInt();

            switch(opc){
                case 1:
                    gestion.addCliente();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
            }

        }

        almacen = gestion.getAlmacen();
        return almacen;
    }
}
