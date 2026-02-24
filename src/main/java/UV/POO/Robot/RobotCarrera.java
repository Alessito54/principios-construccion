package UV.POO.Robot;

public class RobotCarrera extends Robot {
    private int kmPorHora;

    public RobotCarrera(String apodo, int energia, int kmPorHora) {
        super(apodo, energia);
        this.kmPorHora = kmPorHora;
    }

    @Override
    public String obtenerFichaTecnica() {
        return super.obtenerFichaTecnica() + "\n   -> Velocidad: " + kmPorHora + " km/h";
    }
}