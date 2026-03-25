package UV.Patrones_de_diseno.AbstractFactory;

public class Main {
 
    public static void main(String[] args){
        VehiculoFactory honda= new HondaFactory();
        
        System.out.println("------Honda------");
        VehiculoCliente hondaCliente=new VehiculoCliente(honda, "Regular");
        System.out.println(hondaCliente.getNombreBicicleta());
        System.out.println(hondaCliente.getNombreMotocicleta());
        System.out.println(hondaCliente.getNombreScooter());
        
        hondaCliente=new VehiculoCliente(honda, "Deportiva");
        System.out.println(hondaCliente.getNombreBicicleta());
        System.out.println(hondaCliente.getNombreMotocicleta());
        System.out.println(hondaCliente.getNombreScooter());
        
        
        VehiculoFactory hero= new HeroFactory();
        
        System.out.println("------Hero------");
        VehiculoCliente heroCliente=new VehiculoCliente(hero, "Regular");
        System.out.println(heroCliente.getNombreBicicleta());
        System.out.println(heroCliente.getNombreMotocicleta());
        System.out.println(heroCliente.getNombreScooter());
        
        heroCliente=new VehiculoCliente(hero, "Deportiva");
        System.out.println(heroCliente.getNombreBicicleta());
        System.out.println(heroCliente.getNombreMotocicleta());
        System.out.println(heroCliente.getNombreScooter());
    }
   
}
