package UV.Patrones_de_diseno.AbstractFactory.tarea;

public class CocaColaFactory extends BebidaFactory {

    @Override
    public Refresco crearRefrescoNormal() {
        return new RefrescoCocaColaNormal();
    }

    @Override
    public Refresco crearRefrescoLight() {
        return new RefrescoCocaColaLight();
    }

    @Override
    public Jugo crearJugoNormal() {
        return new JugoCocaColaNormal();
    }

    @Override
    public Jugo crearJugoLight() {
        return new JugoCocaColaLight();
    }
}
