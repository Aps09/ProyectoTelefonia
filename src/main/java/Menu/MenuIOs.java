package Menu;
import Almacenamiento.Almacen;
import Almacenamiento.gestionIOs;
import java.util.Scanner;
import Serializable.*;

public class MenuIOs {

    public static Almacen main (Almacen almacen){

        String fichero = "Serializable.ficheroData";
        gestionIOs gestion = new gestionIOs(almacen, fichero);

        opcionesIOs[] menu = opcionesIOs.values();
        Scanner scan = new Scanner(System.in);
        int opc;

        do{
            System.out.println("");
            for (opcionesIOs m : menu) {
                System.out.printf("%d) %s%n", m.ordinal() + 1, m.name());
            }

            System.out.print("Elija una opción: ");
            opc = scan.nextInt();

            switch(opc){
                case 1:
                    // Forzar Cargado
                    Almacen almacenCargado = gestion.CargadoDeDatos();
                    almacen = almacenCargado;
                    break;
                case 2:
                    // Forzar Guardado
                    gestion.GuardadoDeDatos();
                    break;
                case 3:
                    // Borrado Total
                    gestion.BorradoDeFichero();
                    break;
            }
        }while (opc != 4);



        almacen = gestion.getAlmacen();
        return almacen;
    }
}
