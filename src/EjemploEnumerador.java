import java.util.Arrays;

public class EjemploEnumerador {
    public static void main(String[] args) {
        Color miColor = Color.ROJO;
        System.out.println("miColor = " + miColor);

        // Imprimir el contenido
        System.out.println("Arrays.toString(Color.values()) = " + Arrays.toString(Color.values()));

        // Recorrer enum Color
        for (Color colores : Color.values()) {
            System.out.println("colores = " + colores);
        }
        System.out.println("------------");
        // Control de flujo o toma de decisiones
        // if
        miColor = Color.VERDE;
        if (miColor == Color.AZUL){
            System.out.println("Que bonito! El color del mar y el cielo!");
        } else if (miColor == Color.VERDE) {
            System.out.println("Cuanta Hierba!!, verdesitoo");
        } else {
            System.out.println("No es ni verde ni azul...");
        }
        System.out.println("-------------------");
        // Switch
        switch (miColor) {
            case AZUL, AMARILLO, NEGRO -> System.out.println("El color es azul!, bueno, o amarillo, o negro...");
            case GRIS -> System.out.println("El color es gris");
            case VERDE -> System.out.println("El color es Verde!");
            case ROJO -> System.out.println("El color es rojo!");
            default -> System.out.println("Es otro color");
        }
    }
}
