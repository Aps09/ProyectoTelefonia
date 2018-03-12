package Cliente;

public class Direccion {

    String provincia;
    String calle;
    int num;
    int piso;
    String puerta;

    // -----------------------------------------------
    // CONSTRUCTORES
    // -----------------------------------------------

    public Direccion(String provincia, String calle, int num, int piso, String puerta){
        this.provincia = provincia;
        this.calle = calle;
        this.num = num;
        this.piso = piso;
        this.puerta = puerta;
    }

    // -------------------------------------------------------------------------
    // GETTERS
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

    // -------------------------------------------------------------------------
    // GETTERS
    // -------------------------------------------------------------------------


    @Override
    public String toString() {
        return calle + ", nº" + num + ", " + piso + "º"+ puerta + ", " + provincia;
    }
}
