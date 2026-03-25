package UV.Patrones_de_diseno.Builder;
public interface ConstructorMueble {
    public void construirBase();
    public void construirEstructura();
    public void construirInterior();
    public void construirPresentacion();
    public Mueble getMueble();

    
}
