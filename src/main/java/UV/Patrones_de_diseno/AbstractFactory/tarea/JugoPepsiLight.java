package UV.Patrones_de_diseno.AbstractFactory.tarea;

public class JugoPepsiLight implements Jugo {

    @Override
    public String getNombre() {
        return "Pepsi Jugo Light";
    }

    @Override
    public String getMarca() {
        return "Pepsi";
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Marca: " + getMarca() + " | Tipo: " + getNombre() + 
                         " | Calorías: 50 cal | Azúcar: Edulcorante | Concentración: 100% Jugo");
    }
}
