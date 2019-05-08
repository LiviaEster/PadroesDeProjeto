package adapter;

/**
 *
 * @author livia
 */
public class AdapterBinario extends Calculadora {
   
    
    public void DecimaltoBinario(Double resultado){
    System.out.println("\nResultado em binário: \n" + Integer.toBinaryString(Double.valueOf(resultado).intValue()) + "\n");
   
   }
 }