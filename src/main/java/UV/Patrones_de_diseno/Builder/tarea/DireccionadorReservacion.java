package UV.Patrones_de_diseno.Builder.tarea;

public class DireccionadorReservacion {
    private ConstructorReservacion constructor;

    public DireccionadorReservacion(ConstructorReservacion constructor) {
        this.constructor = constructor;
    }

    public Reservacion crearReservacion(String fecha, String nombre, int numeroPersonas,
                                        int numeroDias, TemporadaTarifa temporada) {
        // Establecer los datos básicos
        constructor.establecerFecha(fecha);
        constructor.establecerNombre(nombre);
        constructor.establecerNumeroPersonas(numeroPersonas);
        constructor.establecerNumeroDias(numeroDias);
        constructor.establecerTemporada(temporada);

        // Determinar el tipo de cliente según el constructor
        if (constructor instanceof ConstructorReservacionFrecuente) {
            constructor.establecerTipoCliente(TipoCliente.FRECUENTE);
        } else {
            constructor.establecerTipoCliente(TipoCliente.OCASIONAL);
        }

        // Construir las promociones según el tipo de cliente
        constructor.construirDesayuno();
        constructor.construirDescuento();

        // Construir y retornar la reservación
        return constructor.construir();
    }
}
