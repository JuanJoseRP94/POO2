public enum Catalogo2 {
    TALADRO("Taladro eléctrico","Percutor BL 60nM", 69.99),
    DESTORNILLADOR("Destornillador","Comprobador de tensión", 4),
    JUEGO_PUNTAS("Juego de puntas", "Puntas y llaves vaso", 35.99),
    JUEGO_BROCAS("Juego de brocas", "Punta widea 4mm", 8.54);

    // Asociamos las características que tendrá la lista Enum de arriba
    private final String nombre;
    private final String descripcion;
    private final double pvp;

    // Creamos el catalogo para que contenga esas carácteristicas en ese orden
    Catalogo2(String nombre, String descripcion, double pvp) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.pvp = pvp;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPvp() {
        return pvp;
    }
}
