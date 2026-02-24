package UV.POO.Robot;

import javax.swing.JOptionPane;

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
            menuOpcion = Integer.parseInt(seleccion);

            switch (menuOpcion) {
                case 1:
                    String nP = JOptionPane.showInputDialog("Apodo:");
                    int eP = Integer.parseInt(JOptionPane.showInputDialog("Energía (%):"));
                    String ubi = JOptionPane.showInputDialog("País:");
                    String est = JOptionPane.showInputDialog("Estilo:");
                    miFabrica.registrarRobot(new RobotPelea(nP, eP, ubi, est));
                    break;
                case 2:
                    String nC = JOptionPane.showInputDialog("Apodo:");
                    int eC = Integer.parseInt(JOptionPane.showInputDialog("Energía (%):"));
                    int vel = Integer.parseInt(JOptionPane.showInputDialog("Velocidad:"));
                    miFabrica.registrarRobot(new RobotCarrera(nC, eC, vel));
                    break;
                case 3:
                    String nB = JOptionPane.showInputDialog("Apodo:");
                    int eB = Integer.parseInt(JOptionPane.showInputDialog("Energía (%):"));
                    miFabrica.registrarRobot(new Robot(nB, eB));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, miFabrica.mostrarInventario());
                    break;
            }
        } while (menuOpcion != 5);
    }
}