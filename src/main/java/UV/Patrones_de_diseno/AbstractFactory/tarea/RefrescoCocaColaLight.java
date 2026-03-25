package UV.Patrones_de_diseno.AbstractFactory.tarea;

public class RefrescoCocaColaLight implements Refresco {

    @Override
    public String getNombre() {
        return "Coca-Cola Refresco Light";
    }

    @Override
    public String getMarca() {
        return "Coca-Cola";
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Marca: " + getMarca() + " | Tipo: " + getNombre() + 
                         " | Calorías: 5 cal | Azúcar: Sin Azúcar");
    }
}
