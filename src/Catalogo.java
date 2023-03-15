public enum Catalogo {
    TALADRO("Taladro eléctrico", "Percutor BL 60Nm", 69.99),
    DESTORNILLADOR("Destornillador", "Comprobador de tensión", 4),
    JUEGO_PUNTAS("Juego de puntas", "Puntas y llaves vaso", 35.99),
    JUEGO_BROCAS("Juego de brocas", "Punta widea 1..4mm", 8.54);

    private final String nombre;
    private final String descripcion;
    private final double pvp;


    Catalogo(String nombre, String descripcion, double pvp) {
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
