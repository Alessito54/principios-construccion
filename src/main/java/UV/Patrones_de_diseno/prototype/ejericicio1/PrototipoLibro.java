package UV.Patrones_de_diseno.prototype.ejericicio1;

public abstract class PrototipoLibro implements Cloneable {
    private String isbn;
    private String titulo;
    private String autor;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = (PrototipoLibro) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public String getDatosLibro() {
        return "Datos del librio:\nISBN: " + isbn + ",\nTítulo: " + titulo + ",\nAutor: " + autor + "\n";
    }
}
