package UV.Patrones_de_diseno.AbstractFactory.tarea;

public class RefrescoCocaColaNormal implements Refresco {

    @Override
    public String getNombre() {
        return "Coca-Cola Refresco Normal";
    }

    @Override
    public String getMarca() {
        return "Coca-Cola";
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Marca: " + getMarca() + " | Tipo: " + getNombre() + 
                         " | Calorías: 140 cal | Azúcar: Con Azúcar");
    }
}
