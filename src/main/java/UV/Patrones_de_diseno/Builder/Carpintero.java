package UV.Patrones_de_diseno.Builder;

public class Carpintero {
    private ConstructorMueble constructorMueble;

    public Carpintero(ConstructorMueble constructorMueble) {
        this.constructorMueble = constructorMueble;
    }

    public void construirMueble() {
        this.constructorMueble.construirBase();
        this.constructorMueble.construirEstructura();
        this.constructorMueble.construirInterior();
        this.constructorMueble.construirPresentacion();
    }

    public Mueble getMueble() {

        return this.constructorMueble.getMueble();
       
    }

}
