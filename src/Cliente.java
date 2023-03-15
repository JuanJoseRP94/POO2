public class Cliente {

    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private String cPostal;
    private String poblacion;
    private String email;

    //
    // Constructors
    //

    public Cliente(String nombre, String apellidos, String dni, String direccion, String cPostal, String poblacion, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.cPostal = cPostal;
        this.poblacion = poblacion;
        this.email = email;
    }


    // METODO
    public String datosCliente() {
        return "Cliente:\n" +
                "\t" + nombre + " " + apellidos + "\n" +
                "\t" + direccion + "\n" +
                "\t" + cPostal + " - " + poblacion + "\n" +
                "\t" + "NIF: " + dni + "\n" +
                "\t" + "email: " + email;
    }


}
