package ejemploherencia;

/**
 *
 * @author DANIELCASTELAO\mmartinezcosta
 */
public class Libro extends Publicacion{
    private String autor;
    private String isbn;
    private String titulo;

    public Libro() {
    }

    public Libro(String autor, String isbn, String titulo) {
        this.autor = autor;
        this.isbn = isbn;
        this.titulo = titulo;
    }

    public Libro(String autor, String isbn, String titulo, int numPaginas, float precio) {
        super(numPaginas, precio);
        this.autor = autor;
        this.isbn = isbn;
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

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

    @Override
    public String toString() {
        return   super.toString()+" autor= " + autor + ", isbn= " + isbn + ", titulo= " + titulo ;
    }   
    
    
}
