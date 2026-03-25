package UV.Patrones_de_diseno.Builder.tarea;

public abstract class ConstructorReservacion {
    protected String fecha;
    protected String nombre;
    protected int numeroPersonas;
    protected int numeroDias;
    protected TipoCliente tipoCliente;
    protected TemporadaTarifa temporada;
    protected boolean incluirDesayuno;
    protected boolean tienDescuento;

    public abstract void construirDesayuno();
    public abstract void construirDescuento();

    public void establecerFecha(String fecha) {
        this.fecha = fecha;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public void establecerNumeroDias(int numeroDias) {
        this.numeroDias = numeroDias;
    }

    public void establecerTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public void establecerTemporada(TemporadaTarifa temporada) {
        this.temporada = temporada;
    }

    public Reservacion construir() {
        return new Reservacion(fecha, nombre, numeroPersonas, numeroDias,
                              tipoCliente, temporada, incluirDesayuno, tienDescuento);
    }
}
