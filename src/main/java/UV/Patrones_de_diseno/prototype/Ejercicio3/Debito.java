package UV.Patrones_de_diseno.prototype.Ejercicio3;

public class Debito extends Tarjeta {
    @Override
    public void pagar(int cantidad) {
        System.out.println("Pagando " + cantidad + " con tarjeta de débito.");
    }

}
