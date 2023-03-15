public class Alumno {

        // Atributos
        String nombre;
        private String apellidos;
        private String correo;
        private Contactos companiero;

        // Constructor

    public Alumno(String nombre, String apellidos, String correo, Contactos companiero){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.companiero = companiero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public Contactos getCompaniero() {
        return companiero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCompaniero(Contactos companiero) {
        this.companiero = companiero;
    }
}
