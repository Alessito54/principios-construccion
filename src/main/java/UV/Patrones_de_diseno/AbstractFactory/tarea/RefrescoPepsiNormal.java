package UV.Patrones_de_diseno.AbstractFactory.tarea;

public class RefrescoPepsiNormal implements Refresco {

    @Override
    public String getNombre() {
        return "Pepsi Refresco Normal";
    }

    @Override
    public String getMarca() {
        return "Pepsi";
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Marca: " + getMarca() + " | Tipo: " + getNombre() + 
                         " | Calorías: 150 cal | Azúcar: Con Azúcar");
    }
}
