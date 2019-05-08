package adapter;

/**
 *
 * @author livia
 */
public class AdapterHexadecimal extends Calculadora {
   
    public void DecimaltoHexadecimal(Double resultado){
    System.out.println("\nResultado em hexadecimal: \n" + Integer.toHexString(Double.valueOf(resultado).intValue()) + "\n");
    
    }
}