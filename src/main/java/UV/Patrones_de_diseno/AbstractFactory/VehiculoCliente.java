package UV.Patrones_de_diseno.AbstractFactory;

public class VehiculoCliente {
    Bicicleta bicicleta;
    Motocicleta motocicleta;
    Scooter scooter;

    public VehiculoCliente(VehiculoFactory factory, String tipo) {
        bicicleta = factory.getBicicleta(tipo);
        motocicleta = factory.getMotocicleta(tipo);
        scooter = factory.getScooter(tipo);
    }

    public String getNombreBicicleta() {
        return bicicleta.getNombre();
    }

    public String getNombreMotocicleta() {
        return motocicleta.getNombre();
    }

    public String getNombreScooter() {
        return scooter.getNombre();
    }
}
