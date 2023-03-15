public class EjemploAlumnos {
    public static void main(String[] args) {
        Alumno juancho = new Alumno("Juancho", "Romero Palacios", "juancho.rom.pal@gmail.com", Contactos.ANA);
        System.out.println("juancho.nombre = " + juancho.nombre);
        System.out.println("juancho.getApellidos() = " + juancho.getApellidos());
        System.out.println("juancho.getCorreo() = " + juancho.getCorreo());
        System.out.println("juancho.getCompaniero() = " + juancho.getCompaniero());
        System.out.println("juancho.getCompaniero().getCorreo() = " + juancho.getCompaniero().getCorreo());
        System.out.println("juancho.getCompaniero().getNombre() = " + juancho.getCompaniero().getNombre());
        System.out.println("juancho.getCompaniero().getTelefono() = " + juancho.getCompaniero().getTelefono());

        System.out.println("----------------------------------------");
        Contactos[] companieros = {Contactos.MARTA,Contactos.JUAN};
        Alumno2 eduardo = new Alumno2("Eduardo", "Corral Muñoz", "eduardo@corral.es",companieros);
        System.out.println("eduardo.getNombre() = " + eduardo.getNombre());
        System.out.println("eduardo.getApellidos() = " + eduardo.getApellidos());
        System.out.println("eduardo.getCorreo() = " + eduardo.getCorreo());
        
        // System.out.println("eduardo.getCompaniero() = " + eduardo.getCompaniero());
        for (Contactos miembro: eduardo.getCompaniero()){
            System.out.println("miembro = " + miembro);
        }
    }
}
