package Menu;

public enum opcionesMenuPrincipal {
    Menu_Clientes("Menú clientes"),
    Menu_Llamadas("Menú llamadas"),
    Menu_Facturas("Menú facturas"),
    Salir("salir");

    private String description;

    opcionesMenuPrincipal()
    {
        this.description = this.name();
    }

    opcionesMenuPrincipal(String name)
    {
        this.description = description;
    }

    public String toString()
    {
        return description;
    }


}
