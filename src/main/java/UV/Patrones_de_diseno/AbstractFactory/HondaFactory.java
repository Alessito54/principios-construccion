package UV.Patrones_de_diseno.AbstractFactory;

public class HondaFactory implements VehiculoFactory{

    @Override
    public Bicicleta getBicicleta(String bicicleta) {
        switch(bicicleta){
            case "Regular": return new BicicletaRegular();
            case "Deportiva": return new BicicletaDeportiva();
            default: System.err.println("Vehiculo"+bicicleta+" no pudo ser creado"); return null;
        }
    }

    @Override
    public Motocicleta getMotocicleta(String motocicleta) {
    switch(motocicleta){
            case "Regular": return new MotocicletaRegular();
            case "Deportiva": return new MotocicletaDeportiva();
            default: System.err.println("Vehiculo"+motocicleta+" no pudo ser creado"); return null;
        }
    }
    public Scooter getScooter(String scooter) {
    switch(scooter){
            case "Regular": return new ScooterRegular();
            case "Deportiva": return new ScooterDeportiva();
            default: System.err.println("Vehiculo"+scooter+" no pudo ser creado"); return null;
        }
    }
}