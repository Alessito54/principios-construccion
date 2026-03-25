package UV.Patrones_de_diseno.AbstractFactory.tarea;

public class JugoPepsiNormal implements Jugo {

    @Override
    public String getNombre() {
        return "Pepsi Jugo Normal";
    }

    @Override
    public String getMarca() {
        return "Pepsi";
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Marca: " + getMarca() + " | Tipo: " + getNombre() + 
                         " | Calorías: 120 cal | Azúcar: Con Azúcar | Concentración: 100% Jugo");
    }
}
