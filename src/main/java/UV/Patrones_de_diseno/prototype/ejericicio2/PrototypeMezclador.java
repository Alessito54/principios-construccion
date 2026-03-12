package UV.Patrones_de_diseno.prototype.ejericicio2;

public class PrototypeMezclador extends PrototypeMaquina{

    private int porcentajeMezlca;
    
    public PrototypeMezclador(int id, String localizacion, int tiempoProduccion){
        super(id, localizacion, tiempoProduccion);
        super.setTiempoFalla(80);
    }
    
    public PrototypeMezclador(int id, String localizacion, int tiempoProduccion,int porcentajeMezcla){
        super(id, localizacion, tiempoProduccion);
        super.setTiempoFalla(80);
        this.porcentajeMezlca = porcentajeMezcla;
    }

    public int getPorcentajeMezlca() {
        return porcentajeMezlca;
    }

    public void setPorcentajeMezlca(int porcentajeMezlca) {
        this.porcentajeMezlca = porcentajeMezlca;
    }
    
    @Override
    public String toString() {
        return "-- Prototype Mezclador --\n" + "id: " + id + "\ntiempo de producción: " + tiempoProduccion + "\ntiempo promedio de falla: " + tiempoFalla + "\nporcentaje de mezcla: " + porcentajeMezlca;
    }     
}
