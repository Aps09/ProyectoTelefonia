package Menu;

public enum opcionesLlamadas {

    Añadir_Llamada("Añadir una llamada"),
    Listar_Llamadas("Listar llamadas de un cliente"),
    Atrás("Ir al menú anterior");

    private String description;

    opcionesLlamadas()
    {
        this.description = this.name();
    }

    opcionesLlamadas(String name)
    {
        this.description = description;
    }

    public String toString()
    {
        return description;
    }


}
