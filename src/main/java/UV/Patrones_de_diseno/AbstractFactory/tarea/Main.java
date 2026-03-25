package UV.Patrones_de_diseno.AbstractFactory.tarea;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== SISTEMA DE PRODUCCIÓN DE BEBIDAS - PATRÓN ABSTRACT FACTORY =====\n");

        // Producción de bebidas Coca-Cola
        System.out.println("1. LÍNEA DE PRODUCCIÓN COCA-COLA");
        BebidaFactory factoryCocaCola = new CocaColaFactory();
        ClienteBebidas clienteCocaCola = new ClienteBebidas(factoryCocaCola);
        clienteCocaCola.producirBebidas();

        // Producción de bebidas Pepsi
        System.out.println("\n2. LÍNEA DE PRODUCCIÓN PEPSI");
        BebidaFactory factoryPepsi = new PepsiFactory();
        ClienteBebidas clientePepsi = new ClienteBebidas(factoryPepsi);
        clientePepsi.producirBebidas();

        // Demostración de uso flexible del patrón
        System.out.println("\n3. PRODUCCIÓN FLEXIBLE CON FACTORÍAS INTERCAMBIABLES");
        producirBebidas("Coca-Cola", new CocaColaFactory());
        producirBebidas("Pepsi", new PepsiFactory());
    }

    // Método auxiliar que demuestra la flexibilidad del patrón
    private static void producirBebidas(String marca, BebidaFactory factory) {
        System.out.println("\n--- Producción de " + marca + " ---");
        
        Refresco refrescoNormal = factory.crearRefrescoNormal();
        Refresco refrescoLight = factory.crearRefrescoLight();
        Jugo jugoNormal = factory.crearJugoNormal();
        Jugo jugoLight = factory.crearJugoLight();

        System.out.println("Refrescos:");
        System.out.print("  - ");
        refrescoNormal.mostrarDetalles();
        System.out.print("  - ");
        refrescoLight.mostrarDetalles();

        System.out.println("Jugos:");
        System.out.print("  - ");
        jugoNormal.mostrarDetalles();
        System.out.print("  - ");
        jugoLight.mostrarDetalles();
    }
}
