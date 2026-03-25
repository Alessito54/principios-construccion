package UV.Patrones_de_diseno.AbstractFactory.tarea;

public class PepsiFactory extends BebidaFactory {

    @Override
    public Refresco crearRefrescoNormal() {
        return new RefrescoPepsiNormal();
    }

    @Override
    public Refresco crearRefrescoLight() {
        return new RefrescoPepsiLight();
    }

    @Override
    public Jugo crearJugoNormal() {
        return new JugoPepsiNormal();
    }

    @Override
    public Jugo crearJugoLight() {
        return new JugoPepsiLight();
    }
}
