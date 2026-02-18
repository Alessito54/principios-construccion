package UV.POO.Herencia;

import java.util.ArrayList;
import java.util.Scanner;

public class UsaEmpleado {

        public static void leerEmpleadoYAgregar(ArrayList<Empleado> empleados, Scanner sc) {
        Empleado nuevo = new Empleado();

        System.out.print("Nombre: ");
        nuevo.setNombre(sc.nextLine());

        System.out.print("Edad: ");
        nuevo.setEdad(Integer.parseInt(sc.nextLine()));

        System.out.print("Fecha de nacimiento (dd/mm/yyyy): ");
        nuevo.setFechaN(sc.nextLine());

        System.out.print("Sueldo: ");
        nuevo.setSueldo(Double.parseDouble(sc.nextLine()));

        empleados.add(nuevo);
    }
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Empleado Instancia 1: Con constructor vacío y setters
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Gael");
        empleado1.setEdad(33);
        empleado1.setFechaN("22/11/1990");
        empleado1.setSueldo(2000.0);

        System.out.println("Empleado 1 (Constructor vacío + Setters):");
        System.out.println("Nombre: " + empleado1.getNombre() +
                "\nEdad: " + empleado1.getEdad() +
                "\nFecha de nacimiento: " + empleado1.getFechaN() +
                "\nSueldo: " + empleado1.getSueldo());

        // Empleado Instancia 2: Con constructor parametrizado
        Empleado empleado2 = new Empleado("María López", 28, "15/05/1995");
        empleado2.setSueldo(2500.0);

        System.out.println("\nEmpleado 2 (Constructor parametrizado):");
        System.out.println("Nombre: " + empleado2.getNombre() +
                "\nEdad: " + empleado2.getEdad() +
                "\nFecha de nacimiento: " + empleado2.getFechaN() +
                "\nSueldo: " + empleado2.getSueldo());

        // Administrativos Instancia 1: Con constructor vacío y setters
        Administrativos admin1 = new Administrativos();
        admin1.setNombre("Carlos Martínez");
        admin1.setEdad(40);
        admin1.setFechaN("10/03/1985");
        admin1.setSueldo(1800.0);
        admin1.setDepartamento("Recursos Humanos");
        admin1.setPerfil("Gerente");

        System.out.println("\nAdministrativo 1 (Constructor vacío + Setters):");
        System.out.println("Nombre: " + admin1.getNombre() +
                "\nEdad: " + admin1.getEdad() +
                "\nFecha de nacimiento: " + admin1.getFechaN() +
                "\nSueldo: " + admin1.getSueldo() +
                "\nDepartamento: " + admin1.getDepartamento() +
                "\nPerfil: " + admin1.getPerfil());

        // Administrativos Instancia 2: Con constructor parametrizado
        Administrativos admin2 = new Administrativos("Finanzas", "Contador", "Laura Gómez", 35, "22/07/1990");
        admin2.setSueldo(2200.0);

        System.out.println("\nAdministrativo 2 (Constructor parametrizado):");
        System.out.println("Nombre: " + admin2.getNombre() +
                "\nEdad: " + admin2.getEdad() +
                "\nFecha de nacimiento: " + admin2.getFechaN() +
                "\nSueldo: " + admin2.getSueldo() +
                "\nDepartamento: " + admin2.getDepartamento() +
                "\nPerfil: " + admin2.getPerfil());

        // Profesores Instancia 1: Con constructor vacío y setters
        Profesores profesor1 = new Profesores();
        profesor1.setNombre("Goku");
        profesor1.setEdad(45);
        profesor1.setFechaN("12/11/1980");
        profesor1.setSueldo(1500.0);
        profesor1.setEspecialidad("POO");
        profesor1.setMaterias("Programación, Base de Datos");

        System.out.println("\nProfesor 1 (Constructor vacío + Setters):");
        System.out.println("Nombre: " + profesor1.getNombre() +
                "\nEdad: " + profesor1.getEdad() +
                "\nFecha de nacimiento: " + profesor1.getFechaN() +
                "\nSueldo: " + profesor1.getSueldo() +
                "\nEspecialidad: " + profesor1.getEspecialidad() +
                "\nMaterias: " + profesor1.getMaterias());

        // Profesores Instancia 2: Con constructor parametrizado
        Profesores profesor2 = new Profesores("Análisis de Sistemas", "Ingeniería de Software, Arquitectura",
                "Dr. Juan Pérez", 52, "05/06/1973");
        profesor2.setSueldo(2100.0);

        System.out.println("\nProfesor 2 (Constructor parametrizado):");
        System.out.println("Nombre: " + profesor2.getNombre() +
                "\nEdad: " + profesor2.getEdad() +
                "\nFecha de nacimiento: " + profesor2.getFechaN() +
                "\nSueldo: " + profesor2.getSueldo() +
                "\nEspecialidad: " + profesor2.getEspecialidad() +
                "\nMaterias: " + profesor2.getMaterias());

        System.out.println("");

        System.out.print("¿Cuántos empleados quieres capturar?: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
                System.out.println("\nCaptura del empleado #" + (i + 1));
                leerEmpleadoYAgregar(empleados, sc);
        }

        System.out.println("\n=== Empleados capturados ===");
        for (Empleado e : empleados) {
                System.out.println("Nombre: " + e.getNombre()
                        + " | Edad: " + e.getEdad()
                        + " | Fecha Nac: " + e.getFechaN()
                        + " | Sueldo: " + e.getSueldo());
        }

        sc.close();
    }
}
