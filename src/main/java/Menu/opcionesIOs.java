package Menu;

public enum opcionesIOs {
        CargarDatos("Cargar datos"),
        GuardarAhora("Guardar información actual"),
        BorrarFichero("Borrado del fichero de datos"),
        Atras("Ir al menú anterior");

        private String description;

        opcionesIOs(String description) {
            this.description = description;
        }

        public String toString() {
            return description;
        }
}
