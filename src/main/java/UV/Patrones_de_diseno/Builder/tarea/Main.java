package UV.Patrones_de_diseno.Builder.tarea;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== SISTEMA DE RESERVACIONES - PATRÓN BUILDER =====\n");

        // Ejemplo 1: Cliente Frecuente en Temporada Alta
        System.out.println("Ejemplo 1: Cliente Frecuente en Temporada Alta");
        ConstructorReservacion constructorFrecuente1 = new ConstructorReservacionFrecuente();
        DireccionadorReservacion director1 = new DireccionadorReservacion(constructorFrecuente1);
        Reservacion reservacion1 = director1.crearReservacion(
                "2026-04-15",
                "Juan Pérez",
                2,
                3,
                TemporadaTarifa.ALTA
        );
        System.out.println(reservacion1);

        // Ejemplo 2: Cliente Frecuente en Temporada Baja
        System.out.println("\n\nEjemplo 2: Cliente Frecuente en Temporada Baja");
        ConstructorReservacion constructorFrecuente2 = new ConstructorReservacionFrecuente();
        DireccionadorReservacion director2 = new DireccionadorReservacion(constructorFrecuente2);
        Reservacion reservacion2 = director2.crearReservacion(
                "2026-06-20",
                "María García",
                4,
                5,
                TemporadaTarifa.BAJA
        );
        System.out.println(reservacion2);

        // Ejemplo 3: Cliente Ocasional en Temporada Alta
        System.out.println("\n\nEjemplo 3: Cliente Ocasional en Temporada Alta");
        ConstructorReservacion constructorOcasional1 = new ConstructorReservacionOcasional();
        DireccionadorReservacion director3 = new DireccionadorReservacion(constructorOcasional1);
        Reservacion reservacion3 = director3.crearReservacion(
                "2026-05-10",
                "Carlos López",
                3,
                2,
                TemporadaTarifa.ALTA
        );
        System.out.println(reservacion3);

        // Ejemplo 4: Cliente Ocasional en Temporada Baja
        System.out.println("\n\nEjemplo 4: Cliente Ocasional en Temporada Baja");
        ConstructorReservacion constructorOcasional2 = new ConstructorReservacionOcasional();
        DireccionadorReservacion director4 = new DireccionadorReservacion(constructorOcasional2);
        Reservacion reservacion4 = director4.crearReservacion(
                "2026-07-15",
                "Ana Martínez",
                5,
                4,
                TemporadaTarifa.BAJA
        );
        System.out.println(reservacion4);
    }
}
