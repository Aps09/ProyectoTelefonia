package Menu;

import Almacenamiento.Almacen;
import Excepciones.NoEncontrado;

import java.util.Scanner;
import static Menu.opcionesMenuPrincipal.*;

public class MenuPrincipal {

    public static void main (String[] args) throws NoEncontrado {
        Almacen almacen = new Almacen();
        opcionesMenuPrincipal[] menu = values();
        int opc;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("");
            for (opcionesMenuPrincipal m : menu) {
                System.out.printf("%d) %s%n", m.ordinal() + 1, m.name());
            }

            System.out.print("Elija una opción: ");
            opc = scan.nextInt();

            if(opc > 4 || opc <= 0) throw new IllegalArgumentException("La opción seleccionada no corresponde con ningún menú.");

            switch (opc){
                case 1:
                    //MENU DE CLIENTES
                    almacen = MenuClientes.main(almacen);
                    break;
                case 2:
                    //MENU DE LLAMADAS
                    almacen = MenuLlamadas.main(almacen);
                    break;
                case 3:
                    //MENU DE FACTURAS
                    almacen = MenuFacturas.main(almacen);
                    break;
            }

        }while (opc != 4);
    }

}
