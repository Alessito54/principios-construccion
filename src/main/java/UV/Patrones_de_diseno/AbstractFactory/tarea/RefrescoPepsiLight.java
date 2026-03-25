package UV.Patrones_de_diseno.AbstractFactory.tarea;

public class RefrescoPepsiLight implements Refresco {

    @Override
    public String getNombre() {
        return "Pepsi Refresco Light";
    }

    @Override
    public String getMarca() {
        return "Pepsi";
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Marca: " + getMarca() + " | Tipo: " + getNombre() + 
                         " | Calorías: 0 cal | Azúcar: Edulcorante");
    }
}
