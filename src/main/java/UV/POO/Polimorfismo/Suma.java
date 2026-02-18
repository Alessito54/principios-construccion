package UV.POO.Polimorfismo;

public class Suma {
    public void sumar(int a, int b) {
        System.out.println("La suma de " + a + " y " + b + " es: " + (a + b));
    }
    public double sumar(double a, double b, double c) {
       return a + b + c;
    }
    public int sumar(String mensaje,byte a, byte b) {
        System.out.println(mensaje);
        return a + b;
    }
}
