package UV.POO.Herencia;

public class Administrativos extends Empleado {



    private String departamento;
    private String perfil;
    public Administrativos(){}
    public Administrativos(String departamento, String perfil,String nombre,int edad, String fechaN) {
        super(nombre,edad,fechaN);
        this.departamento = departamento;
        this.perfil = perfil;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getPerfil() {
        return perfil;
    }
    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
    @Override
    public String toString() {
        return "Administrativos [nombre=" + getNombre() + ", edad=" + getEdad() + ", fechaN=" + getFechaN()
                + ", sueldo=" + getSueldo() + ", departamento=" + departamento + ", perfil=" + perfil + "]";
    }
    
}