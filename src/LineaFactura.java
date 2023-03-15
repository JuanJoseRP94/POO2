public class LineaFactura {

    private int uds;
    private Double precioTotal;
    private Catalogo producto;

    //
    // Constructors
    //

  public LineaFactura(int uds, Catalogo producto) {
    this.uds = uds;
    this.producto = producto;
    this.precioTotal = uds * producto.getPvp();
  }

  public String generarLinea() {
      return uds + "\t" + producto.getNombre() + "\t" + producto.getDescripcion() + "\t" + producto.getPvp() + "\t" + precioTotal;
    }

    public int getUds() {
        return uds;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public Catalogo getProducto() {
        return producto;
    }
}
