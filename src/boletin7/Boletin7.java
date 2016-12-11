
package boletin7;

/**
 *
 * @author Alex
 */
public class Boletin7 {

    public static void main(String[] args) {
        
        Biblioteca lib1 = new Biblioteca("El puente","Ron",2,2);
        lib1.prestamo();
        lib1.devolucion();
        System.out.println(lib1.toString());
               
        
    }
    
}
