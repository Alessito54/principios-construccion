package UV.Patrones_de_diseno.Builder;

public class ConstructorConcretoMesa implements ConstructorMueble {
    private Mueble mueble;

    public ConstructorConcretoMesa() {
        this.mueble = new Mueble();
    }

    @Override
    public void construirBase() {
        this.mueble.setBase("4 patas de madera");
    }

    @Override
    public void construirEstructura() {
        this.mueble.setEstructura("Tablero de madera");
    }

    @Override
    public void construirInterior() {
        this.mueble.setInterior("Sin interior");
    }

    @Override
    public void construirPresentacion() {
        this.mueble.setPresentacion("Mesa de comedor");
        this.mueble.setNombre("Mesa");
    }

    @Override
    public Mueble getMueble() {
        return this.mueble;
    }
    
}
