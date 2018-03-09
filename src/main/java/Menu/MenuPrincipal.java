package Menu;

import Almacenamiento.Almacen;
import java.util.Scanner;
import static Menu.opcionesMenuPrincipal.*;

public class MenuPrincipal {

    public static void main (String[] args){
        Almacen almacen = new Almacen();
        opcionesMenuPrincipal[] menu = values();
        int opc = 1;
        Scanner scan = new Scanner(System.in);

        while(opc != 4) {

            for (opcionesMenuPrincipal m : menu) {
                System.out.printf("%d) %s%n", m.ordinal() + 1, m.name());
            }

            System.out.println("Elija una opción: ");
            opc = scan.nextInt();

            switch (opc){
                case 1:
                    //MENU DE CLIENTES
                    almacen = MenuClientes.main(almacen);
                    break;
                case 2:
                    //MENU DE LLAMADAS

                    break;
                case 3:
                    //MENU DE FACTURAS

                    break;
            }

        }
    }

}
