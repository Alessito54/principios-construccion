package UV.Patrones_de_diseno.prototype.Ejercicio3;

public class Main {

    public static void main(String[] args) {
        CreadorTarjeta creador = new CreadorConcretoTarjeta();

        Tarjeta tarjetaCredito = creador.factoryMethod("credito");
        Tarjeta tarjetaDebito = creador.factoryMethod("debito");
        Tarjeta tarjetaDespensa = creador.factoryMethod("despensa");

        tarjetaCredito.pagar(100);
        tarjetaDebito.pagar(50);
        tarjetaDespensa.pagar(30);
    }

}
