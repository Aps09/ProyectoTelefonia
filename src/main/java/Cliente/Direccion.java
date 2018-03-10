package Cliente;

public class Direccion {

    String calle;
    int num;
    int piso;
    String puerta;

    public Direccion(String calle, int num, int piso, String puerta){
        this.calle = calle;
        this.num = num;
        this.piso = piso;
        this.puerta = puerta;
    }

    // -------------------------------------------------------------------------
    // GETTERS Y SETTERS
    // -------------------------------------------------------------------------

    public String getCalle() {
        return calle;
    }

    public int getNum() {
        return num;
    }

    public int getPiso() {
        return piso;
    }

    public String getPuerta() {
        return puerta;
    }
}
