package UV.Patrones_de_diseno.prototype.Ejercicio3;

public class CreadorConcretoTarjeta implements CreadorTarjeta {
    @Override
    public Tarjeta factoryMethod(String tipo) {
        switch (tipo) {
            case "credito": return new Credito();
            case "debito": return new Debito();
            case "despensa": return new Despensa();
            default: System.err.println("Tipo de tarjeta no reconocido: " + tipo); return null;
        }
    }

}
