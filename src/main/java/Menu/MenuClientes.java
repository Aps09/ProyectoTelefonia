package Menu;

import Almacenamiento.Almacen;
import Almacenamiento.gestionClientes;

import java.util.Scanner;

public class MenuClientes {

    public static Almacen main (Almacen almacen){
        gestionClientes gestion = new gestionClientes(almacen);

        opcionesCliente[] menu = opcionesCliente.values();
        Scanner scan = new Scanner(System.in);
        int opc;

        // Mostramos menu
        do{

            for (opcionesCliente m : menu) {
                System.out.printf("%d) %s%n", m.ordinal() + 1, m.name());
            }

            System.out.print("Elija una opción: ");
            opc = scan.nextInt();

            switch(opc){
                case 1:
                    gestion.addCliente();
                    break;
                case 2:
                    gestion.deleteCliente();
                    break;
                case 3:
                    gestion.CambiarTarifa();
                    break;
                case 4:
                    gestion.getDatosCliente();
                    break;
                case 5:
                    gestion.getDatosClientes();
                    break;
            }

        }while (opc != 6);

        almacen = gestion.getAlmacen();
        return almacen;
    }
}
