public class EjemploCarroceria {
    public static void main(String[] args) {
        Carroceria miCoche = Carroceria.BERLINA;
        System.out.println("miCoche = " + miCoche);
        System.out.println("miCoche.descripcion = " + miCoche.getDescripcion());
        System.out.println("miCoche.getNombre() = " + miCoche.getNombre());
        System.out.println("miCoche.getNumeroPuertas() = " + miCoche.getNumeroPuertas());

    }
}
