package Almacenamiento;

import Fecha.Fecha;
import Fecha.Fechable;

import java.util.ArrayList;

public class Fechador<T extends Fechable> {

    public ArrayList<T> entreTiempos(ArrayList<T> componentes, Fecha fechaIni, Fecha fechaFin){
        ArrayList<T> resultado = new ArrayList<T>();

        for(T componente : componentes)
            if(componente.getFecha().compareTo(fechaIni)>=0 && componente.getFecha().compareTo(fechaFin)<= 0)
                resultado.add(componente);

        return resultado;
    }

}
