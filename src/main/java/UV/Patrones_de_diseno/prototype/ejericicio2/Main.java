package UV.Patrones_de_diseno.prototype.ejericicio2;

public class Main {
    
    public static void main(String[] args){
     
        PrototypeFusor prototypeFusor = new PrototypeFusor(1111, "
        ", 60, 50);
        PrototypeFusor cloneFusor1 = (PrototypeFusor) prototypeFusor.clone();
        PrototypeFusor cloneFusor2 = (PrototypeFusor) prototypeFusor.clone();
        cloneFusor2.setId(2222);
        cloneFusor2.setLocalizacion("GuadalAjara");
        cloneFusor2.setRetardo(25);
        cloneFusor2.setTiempoProduccion(35);
        
        PrototypeMezclador prototypeMezclador = new PrototypeMezclador(3333, "Monterrey", 40, 35);
        PrototypeMezclador cloneMezclador1 = (PrototypeMezclador) prototypeMezclador.clone();
        PrototypeMezclador cloneMezclador2 = (PrototypeMezclador) prototypeMezclador.clone();
        cloneMezclador2.setId(4444);
        cloneMezclador2.setLocalizacion("Veracruz");
        cloneMezclador2.setPorcentajeMezlca(150);
        cloneMezclador2.setTiempoProduccion(40);
        
        System.out.println(cloneFusor1);
        System.out.println(cloneFusor2);
        System.out.println(cloneMezclador1);
        System.out.println(cloneMezclador2);    
    }   
}