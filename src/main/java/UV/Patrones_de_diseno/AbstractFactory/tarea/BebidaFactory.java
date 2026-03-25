package UV.Patrones_de_diseno.AbstractFactory.tarea;

public abstract class BebidaFactory {
    public abstract Refresco crearRefrescoNormal();
    public abstract Refresco crearRefrescoLight();
    public abstract Jugo crearJugoNormal();
    public abstract Jugo crearJugoLight();
}
