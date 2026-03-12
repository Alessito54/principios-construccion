package UV.Patrones_de_diseno.prototype.ejericicio1;

public class main {
    public static void main(String[]  是程序的参数) {
       
       //Libros de java
       PrototipoLibroJava prototipoLibroJava = new PrototipoLibroJava();
        prototipoLibroJava.setTitulo("Piensa en java");
    
        PrototipoLibroJava copiaJava1 = (PrototipoLibroJava) prototipoLibroJava.clone();
        copiaJava1.setIsbn("978-84-415-3488-7");
        copiaJava1.setAutor("Bruce Eckel");
        PrototipoLibroJava copiaJava2 = (PrototipoLibroJava) prototipoLibroJava.clone();
        copiaJava2.setIsbn("978-84-415-3488-7");
        copiaJava2.setAutor("Hugo chain");

        System.out.println(copiaJava1.getDatosLibro());
        System.out.println(copiaJava2.getDatosLibro());

        // generar un prototito de php con 2 clones
        // mismo autor, en clones diferentes id y titulo

        PrototipoLibroPHP prototipoLibroPHP = new PrototipoLibroPHP();
        prototipoLibroPHP.setAutor("Andres Manuel Lopez Obrador");

        PrototipoLibroPHP copiaLibroPHP1 = (PrototipoLibroPHP) prototipoLibroPHP.clone();
        PrototipoLibroPHP copiaLibroPHP2 = (PrototipoLibroPHP) prototipoLibroPHP.clone();

        copiaLibroPHP1.setIsbn("978-84-415-3488-7");
        copiaLibroPHP1.setTitulo("PHP para principiantes");

        copiaLibroPHP2.setIsbn("978-84-415-3488-7");
        copiaLibroPHP2.setTitulo("PHP para expertos");

        System.out.println(copiaLibroPHP1.getDatosLibro());
        System.out.println(copiaLibroPHP2.getDatosLibro());


    }
}
      