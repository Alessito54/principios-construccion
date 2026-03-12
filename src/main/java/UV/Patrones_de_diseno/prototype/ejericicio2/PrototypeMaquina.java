package UV.Patrones_de_diseno.prototype.ejericicio2;

public abstract class PrototypeMaquina implements Cloneable {

    protected int id;
    protected String localizacion;
    protected int tiempoProduccion;
    protected int tiempoFalla;

    public PrototypeMaquina(){
        localizacion = "";
        id = 0;
        tiempoProduccion = 0;
        tiempoFalla = 0;
    }
    
    public PrototypeMaquina(int id, String localizacion, int tiempoProduccion) {
        this.id = id;
        this.localizacion = localizacion;
        this.tiempoProduccion = tiempoProduccion;
    }
    
    public Object clone() {
        Object clone = null;
        try {
            clone = (PrototypeMaquina) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public int getTiempoProduccion() {
        return tiempoProduccion;
    }

    public void setTiempoProduccion(int tiempoProduccion) {
        this.tiempoProduccion = tiempoProduccion;
    }

    public int getTiempoFalla() {
        return tiempoFalla;
    }

    public void setTiempoFalla(int tiempoFalla) {
        this.tiempoFalla = tiempoFalla;
    }
}