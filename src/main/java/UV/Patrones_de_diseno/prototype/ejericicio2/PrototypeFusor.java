package UV.Patrones_de_diseno.prototype.ejericicio2;
public class PrototypeFusor extends PrototypeMaquina {

    private int retardo;

    public PrototypeFusor(int id, String localizacion, int tiempoProduccion) {
        super(id, localizacion, tiempoProduccion);
        super.setTiempoFalla(50);
    }

    public PrototypeFusor(int id, String localizacion, int tiempoProduccion, int retardo) {
        super(id, localizacion, tiempoProduccion);
        super.setTiempoFalla(50);
        this.retardo = retardo;
    }

    public int getRetardo() {
        return retardo;
    }

    public void setRetardo(int retardo) {
        this.retardo = retardo;
    }

    @Override
    public String toString() {
        return "-- Prototype Fusor --\n" + "id: " + id + "\ntiempo de producción: " + tiempoProduccion + "\ntiempo promedio de falla: " + tiempoFalla + "\nretardo: " + retardo;
    }    
}