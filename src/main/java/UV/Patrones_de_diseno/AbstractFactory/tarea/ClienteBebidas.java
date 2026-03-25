package UV.Patrones_de_diseno.AbstractFactory.tarea;

public class ClienteBebidas {
    private BebidaFactory factory;

    public ClienteBebidas(BebidaFactory factory) {
        this.factory = factory;
    }

    public void producirBebidas() {
        System.out.println("\n========== PRODUCCIÓN DE BEBIDAS ==========");
        
        // Crear refresco normal
        Refresco refrescoNormal = factory.crearRefrescoNormal();
        System.out.print("\nRefresco Normal: ");
        refrescoNormal.mostrarDetalles();

        // Crear refresco light
        Refresco refrescoLight = factory.crearRefrescoLight();
        System.out.print("Refresco Light: ");
        refrescoLight.mostrarDetalles();

        // Crear jugo normal
        Jugo jugoNormal = factory.crearJugoNormal();
        System.out.print("Jugo Normal: ");
        jugoNormal.mostrarDetalles();

        // Crear jugo light
        Jugo jugoLight = factory.crearJugoLight();
        System.out.print("Jugo Light: ");
        jugoLight.mostrarDetalles();
        
        System.out.println("==========================================");
    }
}
