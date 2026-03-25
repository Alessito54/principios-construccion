package UV.Patrones_de_diseno.Builder.tarea;

public enum TemporadaTarifa {
    ALTA(100.0),
    BAJA(70.0);

    private final double tarifaPorDia;

    TemporadaTarifa(double tarifaPorDia) {
        this.tarifaPorDia = tarifaPorDia;
    }

    public double getTarifaPorDia() {
        return tarifaPorDia;
    }
}
