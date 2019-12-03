package ejemploherencia;

/**
 *
 * @author DANIELCASTELAO\mmartinezcosta
 */
public class Publicacion {
    
    private int numPaginas;
    private float precio;

    public Publicacion() {
    }

    public Publicacion(int numPaginas, float precio) {
        this.numPaginas = numPaginas;
        this.precio = precio;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  "numPaginas= " + numPaginas + ", precio= " + precio ;
    }
    
    
    
    
    
    
    
    
    
}
