package UV.Patrones_de_diseno.AbstractFactory.tarea;

public class JugoCocaColaNormal implements Jugo {

    @Override
    public String getNombre() {
        return "Coca-Cola Jugo Normal";
    }

    @Override
    public String getMarca() {
        return "Coca-Cola";
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Marca: " + getMarca() + " | Tipo: " + getNombre() + 
                         " | Calorías: 110 cal | Azúcar: Con Azúcar | Concentración: 100% Jugo");
    }
}
