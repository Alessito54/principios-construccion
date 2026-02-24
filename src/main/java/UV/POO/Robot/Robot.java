package UV.POO.Robot;

public class Robot {
    protected String apodo;
    protected int energiaRestante;

    public Robot(String apodo, int energiaRestante) {
        this.apodo = apodo;
        this.energiaRestante = energiaRestante;
    }

    public String obtenerFichaTecnica() {
        return "Modelo: " + apodo + " | Energía: " + energiaRestante + "%";
    }
}