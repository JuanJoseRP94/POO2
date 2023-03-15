public enum Contactos {
    // Constanstes -> Nombres compañeros
    // Atributos -> nombre, correo, móvil
    PEPE("José Pérez", "pepe@eoi.es", "648382985"),
    ANA("Ana María González", "ana@eoi.es", "694938281"),
    JUAN("Juan Antonio Corral", "juan@eoi.es", "643828392"),
    MARTA("Marta Castillo", "marta@eoi.es", "693920928");

    private final String nombre;
    private final String correo;
    private final String telefono;

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    Contactos(String nombre, String correo, String telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }
}
