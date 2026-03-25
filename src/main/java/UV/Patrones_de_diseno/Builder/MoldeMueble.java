package UV.Patrones_de_diseno.Builder;

public interface MoldeMueble {
    void setNombre(String nombre);
    void setBase (String base);
    void setEstructura(String estructura);
    void setInterior(String interior);
    void setPresentacion(String presentacion);
    
    String getNombre();
    String getBase();
    String getEstructura();
    String getInterior();
    String getPresentacion();
    
    String datosMueble();
    
}
