package UV.POO.Herencia;

public class Empleado {
    private String nombre;
    private int edad;
    private String fechaN;
    private double sueldo;

    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public Empleado(){}
    public Empleado(String nombre, int edad, String fechaN) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaN = fechaN;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getFechaN() {
        return fechaN;
    }
    public void setFechaN(String fechaN) {
        this.fechaN = fechaN;
    }
    
}
    