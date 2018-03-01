package Menu;

public enum opcionesCliente {
    Añadir_Cliente("Añadir un cliente"),
    Borrar_Cliente("Borrar un cliente"),
    Cambiar_Tarifa("Cambiar tarifa de un cliente"),
    Recuperar_Datos_Cliente ("Recuperar datos de un cliente"),
    Recuperar_Datos_Cliente ("Recuperar datos de todos los clientes"),
    Atrás("Ir al menú anterior");

    private String description;

    opcionesCliente()
    {
        this.description = this.name();
    }

    opcionesCliente(String name)
    {
        this.description = description;
    }

    public String toString()
    {
        return description;
    }


}
