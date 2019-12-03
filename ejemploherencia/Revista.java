package ejemploherencia;

/**
 *
 * @author DANIELCASTELAO\mmartinezcosta
 */
public class Revista  extends Publicacion{
    
    private String nombre;

    
    public Revista (){
        
    }
    /*public Revista (int paginas, float precio, String nombre){
        super(paginas, precio);
        this.nombre=nombre;        
    }*/

    public Revista(String nombre) {
        this.nombre = nombre;
    }

    public Revista(String nombre, int numPaginas, float precio) {
        super(numPaginas, precio);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return super.toString() + ", nombre= " + nombre;
    }
    
    
    
    
    
    
    
    
}
