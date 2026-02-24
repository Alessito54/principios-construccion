package UV.POO.Robot;
public class RobotPelea extends Robot {
    private String ubicacion;
    private String estiloLucha;

    public RobotPelea(String apodo, int energia, String ubicacion, String estiloLucha) {
        super(apodo, energia);
        this.ubicacion = ubicacion;
        this.estiloLucha = estiloLucha;
    }

    @Override
    public String obtenerFichaTecnica() {
        return super.obtenerFichaTecnica() + "\n   -> Origen: " + ubicacion + " | Estilo: " + estiloLucha;
    }
}