package ejemploherencia;

/**
 *
 * @author DANIELCASTELAO\mmartinezcosta
 */
public class EjemploHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    Revista re=new Revista ("abcdef",20, 3.2f);
        System.out.println(re.toString());    
        System.out.println(re); // ==anterior   
    Libro book=new Libro ("Pablo","asfdb","la biblia", 500, 300.99f);
        System.out.println(book.toString());
        System.out.println(book); // ==anterior
    }
    
}
