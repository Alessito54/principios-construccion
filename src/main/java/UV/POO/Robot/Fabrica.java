package UV.POO.Robot;

public class Fabrica {
    private Robot[] inventarioUnidades;
    private int unidadesActuales;

    public Fabrica(int limite) {
        this.inventarioUnidades = new Robot[limite];
        this.unidadesActuales = 0;
    }

    public boolean registrarRobot(Robot r) {
        if (unidadesActuales < inventarioUnidades.length) {
            inventarioUnidades[unidadesActuales] = r;
            unidadesActuales++;
            return true;
        }
        return false;
    }

    public String mostrarInventario() {
        if (unidadesActuales == 0) return "No hay robots registrados.";

        String texto = "--- LISTADO DE FABRICA ---\n";
        for (int i = 0; i < unidadesActuales; i++) {
            texto = texto + (i + 1) + ". " + inventarioUnidades[i].obtenerFichaTecnica() + "\n";
        }
        return texto;
    }
}