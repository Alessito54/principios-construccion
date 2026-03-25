package UV.Patrones_de_diseno.AbstractFactory.tarea;

public class JugoCocaColaLight implements Jugo {

    @Override
    public String getNombre() {
        return "Coca-Cola Jugo Light";
    }

    @Override
    public String getMarca() {
        return "Coca-Cola";
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Marca: " + getMarca() + " | Tipo: " + getNombre() + 
                         " | Calorías: 45 cal | Azúcar: Edulcorante | Concentración: 100% Jugo");
    }
}
