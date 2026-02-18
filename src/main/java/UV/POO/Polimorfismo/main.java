package UV.POO.Polimorfismo;

public class main {
    public static void main(String[] args) {
        Suma suma = new Suma();
        suma.sumar(5, 10);
        double resultado = suma.sumar(2.5, 3.5, 4.0);
        System.out.println("La suma de los números decimales es: " + resultado);
        int resultado2 = suma.sumar("Sumando bytes:", (byte) 10, (byte) 20);
        System.out.println("La suma de los bytes es: " + resultado2);
    }
}
