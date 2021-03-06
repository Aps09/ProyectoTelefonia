package Fecha;

public class Fecha implements Comparable<Fecha> {

    private int dia;
    private int mes;
    private int anyo;

    public Fecha(int dia, int mes, int anyo){
        this.anyo = anyo;
        this.mes = mes;
        this.dia = dia;
    }

    @Override
    public String toString() {
        return  dia + "/" + mes + "/" + anyo;
    }

    public int compareTo(Fecha otro) {
        if(this.anyo < otro.anyo)
            return -1;
        else if (this.anyo > otro.anyo)
            return 1;
        else
            if(this.mes < otro.mes)
                return -1;
            else if(this.mes > otro.mes)
                return 1;
            else
                if(this.dia < otro.dia)
                    return -1;
                else if(this.dia > otro.dia)
                    return 1;
                else return 0;
    }
}
