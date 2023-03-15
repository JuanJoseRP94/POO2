import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Facturacion {
    public static void main(String[] args) {
        // Datos de cliente
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce datos cliente");
        String nombre = introduceDatos("Nombre", entrada);
        String apellidos = introduceDatos("Apellidos: ", entrada);
        String dni = introduceDatos("DNI: ", entrada);
        String direccion = introduceDatos("Direccion: ", entrada);
        String cP = introduceDatos("Código postal: ", entrada);
        String poblacion = introduceDatos("Poblacion: ", entrada);
        String email = introduceDatos("Email: ", entrada);

        Cliente comprador = new Cliente(nombre, apellidos, dni, direccion, cP, poblacion, email);
        System.out.println(comprador.datosCliente());

        // Introducir los productos
        ArrayList<LineaFactura> lineas = new ArrayList<>();
        System.out.println("Introduce productos");
        int uds = 1;
        while (uds != 0) {
            uds = Integer.parseInt(introduceDatos("Unidades (0=salir)", entrada));
            if (uds > 0) {
                String tipo = introduceDatos("Producto: 1 - Talador, 2 - Destonillador, 3 - Puntas, 4 - Brocas : ", entrada);
                Catalogo producto;
                switch (tipo) {
                    case "1":
                        producto = Catalogo.TALADRO;
                        break;
                    case "2":
                        producto = Catalogo.DESTORNILLADOR;
                        break;
                    case "3":
                        producto = Catalogo.JUEGO_PUNTAS;
                        break;
                    case "4":
                        producto = Catalogo.JUEGO_BROCAS;
                        break;
                    default:
                        producto = Catalogo.TALADRO;
                }
                LineaFactura linea = new LineaFactura(uds, producto);
                lineas.add(linea);
            }

        }

        // GENERAR FACTURA
        Factura miFactura = new Factura(comprador, lineas);
        miFactura.imprimeFactura();
    }

    public static String introduceDatos(String mensaje, Scanner in) {
        System.out.print(mensaje + ": ");
        return in.nextLine();
    }
}
