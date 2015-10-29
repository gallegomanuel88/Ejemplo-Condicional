package ejemplocondicional;

/**
 *
 * @author galle
 */
public class EjemploCondicional {

    public static void main(String[] args) {
        int numero1, numero2;
        Comparar obj1 = new Comparar();
        numero1 = obj1.pedirNumEntero1();
        numero2 = obj1.pedirNumEntero2();
        obj1.comparar(numero1, numero2);
        
    }
    
}
