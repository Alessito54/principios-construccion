package UV.Patrones_de_diseno.Builder.tarea;

public class ConstructorReservacionFrecuente extends ConstructorReservacion {

    @Override
    public void construirDesayuno() {
        // Los clientes frecuentes en temporada baja incluyen desayuno
        this.incluirDesayuno = (temporada == TemporadaTarifa.BAJA);
    }

    @Override
    public void construirDescuento() {
        // Los clientes frecuentes siempre obtienen 20% de descuento
        this.tienDescuento = true;
    }
}
