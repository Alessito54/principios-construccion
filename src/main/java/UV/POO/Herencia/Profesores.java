package UV.POO.Herencia;

public class Profesores extends Empleado {
    private String especialidad;
    private String materias;
    public Profesores(){}
    public Profesores(String especialidad, String materias,String nombre,int edad, String fechaN) {
         super(nombre,edad,fechaN);
        this.especialidad = especialidad;
        this.materias = materias;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public String getMaterias() {
        return materias;
    }
    public void setMaterias(String materias) {
        this.materias = materias;
    }
    @Override
    public String toString() {
        return "Profesores [nombre=" + getNombre() + ", edad=" + getEdad() + ", fechaN=" + getFechaN()
                + ", sueldo=" + getSueldo() + ", especialidad=" + especialidad + ", materias=" + materias + "]";
    }


}
