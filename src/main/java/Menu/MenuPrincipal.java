package Menu;

import java.util.Scanner;

import static Menu.opcionesMenuPrincipal.*;

public class MenuPrincipal {

    public static void main (String[] args){
        opcionesMenuPrincipal[] menu = values();
        Scanner scan = new Scanner(System.in);

        for (opcionesMenuPrincipal m: menu){
            System.out.printf("%d) %s%n", m.ordinal() + 1, m.name());
        }

        System.out.println("Elija una opción: ");
        int opc = scan.nextInt();

        switch (opc){
            case Menu_Clientes.ordinal():
                menu.
        }
    }

}
