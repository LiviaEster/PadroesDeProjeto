package adapter;

/**
 *
 * @author livia
 */
public class AdapterOctal extends Calculadora {
   
    public void DecimaltoOctal(Double resultado){
    System.out.println("\nResultado em Octal: \n" + Integer.toOctalString(Double.valueOf(resultado).intValue())  + "\n");
    
    }
}