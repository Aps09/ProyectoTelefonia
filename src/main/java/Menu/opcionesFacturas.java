package Menu;

public enum opcionesFacturas {

    Emitir_Factura("Emitir una factura"),
    Recoger_Factura("Recoger la información de una factura"),
    Recoger_Facturas_Cliente("Recoger todas las facturas de un cliente"),
    Atrás("Ir al menú anterior");

    private String description;

    opcionesFacturas()
    {
        this.description = this.name();
    }

    opcionesFacturas(String name)
    {
        this.description = description;
    }

    public String toString()
    {
        return description;
    }


}
