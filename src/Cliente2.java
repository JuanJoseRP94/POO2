public class Cliente2 {
     private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String codigoPostal;
    private String poblacion;
    private String email;

    // El método constructor
    public Cliente2(String nombre, String apellido, String dni, String direccion, String codigoPostal, String poblacion, String email){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.poblacion = poblacion;
        this.email = email;
    }

    // El método
    public String datosCliente() {
        return "Cliente:\n" +
                "\t" + nombre + " " + apellido + "\n" +
                "\t" + direccion + "\n" +
                "\t" + codigoPostal + " - " + poblacion + "\n" +
                "\t" + "NIF: " + dni + "\n" +
                "\t" + "email: " + email;
    }
}
