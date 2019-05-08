package adapter;

import java.util.Scanner;
/**
 *
 * @author livia
 */
public class Calculadora {
    Double n1;
    Double n2;
    Double resultado;
    
    public Double soma() {
        Scanner input = new Scanner(System.in);
		
                
		System.out.println("\nDigite o 1º numero: ");
			n1 = input.nextDouble();
		System.out.println("Digite o 2º numero: ");
			n2 = input.nextDouble();
			resultado = n1 + n2;
			System.out.println("Resultado da soma: " + resultado + "\n");
		
		return resultado;
}
    
    public Double subtracao() {
        Scanner input = new Scanner(System.in);
  
        
		System.out.println("\nDigite o 1º numero: ");
			n1 = input.nextDouble();
		System.out.println("Digite o 2º numero: ");
			n2 = input.nextDouble();
			resultado = n1 - n2;
			System.out.println("Resultado da subtracao: " + resultado + "\n");
	
		return resultado;
}
    public Double multiplicacao() {
        Scanner input = new Scanner(System.in);
       
        
		System.out.println("\nDigite o 1º numero: ");
			n1 = input.nextDouble();
		System.out.println("Digite o 2º numero: ");
			n2 = input.nextDouble();
			resultado = n1 * n2;
			System.out.println("Resultado da multiplicacao: " + resultado +"\n");
		
                return resultado;
		
}
    
    public Double divisao() {
        Scanner input = new Scanner(System.in);
               
        
		System.out.println("\nDigite o 1º numero: ");
			n1 = input.nextDouble();
		System.out.println("Digite o 2º numero: ");
			n2 = input.nextDouble();
			resultado = n1 / n2;
			System.out.println("Resultado da divisao: " + resultado +"\n");
                        
                return resultado;
		
}
}
