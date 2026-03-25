package UV.Patrones_de_diseno.Builder;

public class ConstructorConcretoSillon implements ConstructorMueble {
    private Mueble mueble;

    public ConstructorConcretoSillon() {
        this.mueble = new Mueble();
        this.mueble.setNombre("Sillón");
    }

    @Override
    public void construirBase() {
        mueble.setBase("Base de madera maciza");
    }

    @Override
    public void construirEstructura() {
        mueble.setEstructura("Estructura reforzada con acero");
    }

    @Override
    public void construirInterior() {
        mueble.setInterior("Relleno de espuma de alta densidad");
    }

    @Override
    public void construirPresentacion() {
        mueble.setPresentacion("Tapizado en tela suave y resistente");
    }

    @Override
    public Mueble getMueble() {
        return this.mueble;
    }

}
