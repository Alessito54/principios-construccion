package UV.POO.Robot;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Fabrica miFabrica = new Fabrica(10);
        int menuOpcion = 0;

        do {
            String menuVisual = "1. Nuevo Robot Pelea\n" +
                                "2. Nuevo Robot Carrera\n" +
                                "3. Nuevo Robot Base\n" +
                                "4. Ver Almacén\n" +
                                "5. Salir";

            String seleccion = JOptionPane.showInputDialog(null, menuVisual, "Gestión de Fábrica", 3);
            if (seleccion == null) break;

            try {
                menuOpcion = Integer.parseInt(seleccion.trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opción no válida.", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            switch (menuOpcion) {
                case 1:
                    crearRobotPelea(miFabrica);
                    break;
                case 2:
                    crearRobotCarrera(miFabrica);
                    break;
                case 3:
                    crearRobotBase(miFabrica);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, miFabrica.mostrarInventario());
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (menuOpcion != 5);
    }

    private static String pedirTexto(String mensaje) {
        String valor = JOptionPane.showInputDialog(mensaje);
        if (valor == null || valor.trim().isEmpty()) return null;
        return valor.trim();
    }

    private static int pedirEntero(String mensaje, int min, int max) {
        String valor = JOptionPane.showInputDialog(mensaje);
        if (valor == null) return Integer.MIN_VALUE;
        try {
            int n = Integer.parseInt(valor.trim());
            if (n < min || n > max) {
                JOptionPane.showMessageDialog(null,
                    "El valor debe estar entre " + min + " y " + max + ".",
                    "Error", JOptionPane.ERROR_MESSAGE);
                return Integer.MIN_VALUE;
            }
            return n;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número.", "Error", JOptionPane.ERROR_MESSAGE);
            return Integer.MIN_VALUE;
        }
    }

    private static void crearRobotPelea(Fabrica fabrica) {
        String nombre = pedirTexto("Apodo:");
        if (nombre == null) return;
        int energia = pedirEntero("Energía (%):", 0, 100);
        if (energia == Integer.MIN_VALUE) return;
        String ubicacion = pedirTexto("País:");
        if (ubicacion == null) return;
        String estilo = pedirTexto("Estilo:");
        if (estilo == null) return;

        if (!fabrica.registrarRobot(new RobotPelea(nombre, energia, ubicacion, estilo))) {
            JOptionPane.showMessageDialog(null, "Fábrica llena, no se pudo registrar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void crearRobotCarrera(Fabrica fabrica) {
        String nombre = pedirTexto("Apodo:");
        if (nombre == null) return;
        int energia = pedirEntero("Energía (%):", 0, 100);
        if (energia == Integer.MIN_VALUE) return;
        int velocidad = pedirEntero("Velocidad (km/h):", 0, 500);
        if (velocidad == Integer.MIN_VALUE) return;

        if (!fabrica.registrarRobot(new RobotCarrera(nombre, energia, velocidad))) {
            JOptionPane.showMessageDialog(null, "Fábrica llena, no se pudo registrar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void crearRobotBase(Fabrica fabrica) {
        String nombre = pedirTexto("Apodo:");
        if (nombre == null) return;
        int energia = pedirEntero("Energía (%):", 0, 100);
        if (energia == Integer.MIN_VALUE) return;

        if (!fabrica.registrarRobot(new Robot(nombre, energia))) {
            JOptionPane.showMessageDialog(null, "Fábrica llena, no se pudo registrar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}