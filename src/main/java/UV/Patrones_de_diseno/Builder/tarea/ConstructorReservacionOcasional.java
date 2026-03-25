package UV.Patrones_de_diseno.Builder.tarea;

public class ConstructorReservacionOcasional extends ConstructorReservacion {

    @Override
    public void construirDesayuno() {
        // Todos incluyen desayuno en temporada baja
        this.incluirDesayuno = (temporada == TemporadaTarifa.BAJA);
    }

    @Override
    public void construirDescuento() {
        // Los clientes ocasionales no reciben descuento
        this.tienDescuento = false;
    }
}
