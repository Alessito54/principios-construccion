package UV.Patrones_de_diseno.AbstractFactory;

public interface VehiculoFactory {
    Bicicleta getBicicleta(String bicicleta);
    Motocicleta getMotocicleta(String motocicleta);
    Scooter getScooter(String scooter);
}
