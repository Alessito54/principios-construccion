package UV.Patrones_de_diseno.Builder.tarea;

public class Reservacion {
    private String fecha;
    private String nombre;
    private int numeroPersonas;
    private int numeroDias;
    private TipoCliente tipoCliente;
    private TemporadaTarifa temporada;
    private double montoTotal;
    private boolean incluirDesayuno;
    private boolean tienDescuento;

    public Reservacion(String fecha, String nombre, int numeroPersonas, int numeroDias,
                       TipoCliente tipoCliente, TemporadaTarifa temporada,
                       boolean incluirDesayuno, boolean tienDescuento) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.numeroPersonas = numeroPersonas;
        this.numeroDias = numeroDias;
        this.tipoCliente = tipoCliente;
        this.temporada = temporada;
        this.incluirDesayuno = incluirDesayuno;
        this.tienDescuento = tienDescuento;
        this.calcularMontoTotal();
    }

    private void calcularMontoTotal() {
        double monto = temporada.getTarifaPorDia() * numeroDias * numeroPersonas;

        if (tienDescuento) {
            monto *= 0.8; // 20% de descuento
        }

        this.montoTotal = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public TemporadaTarifa getTemporada() {
        return temporada;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public boolean isIncluirDesayuno() {
        return incluirDesayuno;
    }

    public boolean isTienDescuento() {
        return tienDescuento;
    }

    @Override
    public String toString() {
        return "\n========== RESERVACION ==========\n" +
                "Nombre: " + nombre + "\n" +
                "Fecha: " + fecha + "\n" +
                "Número de Días: " + numeroDias + "\n" +
                "Número de Personas: " + numeroPersonas + "\n" +
                "Tipo de Cliente: " + tipoCliente + "\n" +
                "Temporada: " + temporada + "\n" +
                "Monto Total: $" + String.format("%.2f", montoTotal) + "\n" +
                "Promociones:\n" +
                "  - Desayuno Incluido: " + (incluirDesayuno ? "SÍ" : "NO") + "\n" +
                "  - Descuento Frecuente (20%): " + (tienDescuento ? "SÍ" : "NO") + "\n" +
                "=================================";
    }
}
