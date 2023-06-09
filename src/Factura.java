import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Factura {

    private Cliente comprador;
    private String numFactura;
    private String fecha;
    private ArrayList<LineaFactura> items; // guardo aqui todas las compras que he hecho
    private Double totalFactura;

    public Factura(Cliente comprador, ArrayList<LineaFactura> items) {
        this.comprador = comprador;
        this.numFactura = generaNumFactura();
        this.fecha = generaFecha();
        this.items = items;
        this.totalFactura = calculaTotal();
    }

    public Double calculaTotal() {
        double suma = 0;
        for(LineaFactura lin : items){
            suma += lin.getPrecioTotal();
        }
        return suma;
    }

    public String generaNumFactura() {
        Random num = new Random();
        return num.nextInt(100000) + "/2023";
    }

    public String generaFecha() {
        DateFormat format = new SimpleDateFormat("dd - MMM - yyyy");
        String fecha = format.format(new Date());
        return fecha;
    }

    public void imprimeFactura() {
        // CABECERA
        System.out.println("Ferretería Gomez \nGarcia de la Huerta, 39 \n41526 - Sevilla \nCIF: B548621254\n\n");
        // DATOS CLIENTE
        System.out.println(comprador.datosCliente());
        // FACTURA Y FECHA
        System.out.println("Numero de factura: "+ numFactura);
        System.out.println("Fecha: "+ fecha);
        // ITEMS
        System.out.println("Uds                 Nombre              Descripcion             PVP             Precio total");
        for(LineaFactura lin : items){
            System.out.println(lin.generarLinea());
        }

        // TOTAL DE LA FACTURA
        System.out.println("Total de la factura: " + totalFactura);
        System.out.println("IVA 21%: " + totalFactura * .21);
        System.out.println("Total a pagar: " + totalFactura * 1.21);
    }


}
