package UV.Patrones_de_diseno.Builder;

public class Mueble implements MoldeMueble{
    private String nombre;
    private String base;
    private String estructura;
    private String interior;
    private String presentacion;

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setBase(String base) {
        this.base = base;
    }

    @Override
    public void setEstructura(String estructura) {
        this.estructura = estructura;
    }

    @Override
    public void setInterior(String interior) {
        this.interior = interior;
    }

    @Override
    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getBase() {
        return base;
    }

    @Override
    public String getEstructura() {
        return estructura;
    }

    @Override
    public String getInterior() {
        return interior;
    }

    @Override
    public String getPresentacion() {
        return presentacion;
    }

    @Override
    public String datosMueble() {
        return "Mueble{" +
            "nombre='" + nombre + '\'' +
            ", base='" + base + '\'' +
            ", estructura='" + estructura + '\'' +
            ", interior='" + interior + '\'' +
            ", presentacion='" + presentacion + '\'' +
            '}';
    }    
}
