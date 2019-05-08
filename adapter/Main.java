package adapter;

import java.util.Scanner; 
/**
 *
 * @author livia
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       	int escolha;
        int escolha2;
        int escolha3;
        Double resultado = 0.0;
        
            System.out.println(" Digite: \n 1 para realizar uma adição \n 2 para realizar uma subtração \n 3 para realizar uma multiplicação \n 4 para realizar uma divisão \n");
            escolha = input.nextInt();
            
		switch (escolha) {
		case 1:
			Calculadora adicao = new Calculadora();
			resultado = adicao.soma();
                        break;
    
		case 2:
			Calculadora subtracao = new Calculadora();
			resultado = subtracao.subtracao();
			break;
		case 3:
			Calculadora multiplicacao = new Calculadora();
			resultado = multiplicacao.multiplicacao();
			break;
		case 4:
        		Calculadora divisao = new Calculadora();
			resultado = divisao.divisao();
                	
                }
              
        System.out.println(" \n Digite: \n 1 para número em decimal \n 2 para binário \n 3 para hexadecimal \n 4 para octal \n");
            escolha2 = input.nextInt();
            
		switch (escolha2) {
		case 1:
			System.out.println("\nResultado em decimal: \n" + resultado + "\n");
			break;
		case 2:
			AdapterBinario resultado1 = new AdapterBinario();
                        resultado1.DecimaltoBinario(resultado);
			break;
		case 3:
                        AdapterHexadecimal resultado2 = new AdapterHexadecimal();
                        resultado2.DecimaltoHexadecimal(resultado);
			break;
		case 4:
        		AdapterOctal resultado3 = new AdapterOctal();
                        resultado3.DecimaltoOctal(resultado);
			break;
			}
                
                System.out.println("Digite 1 para continuar usando a calculadora ou 2 para encerrar \n");
                escolha3 = input.nextInt();
                if(escolha3 == 1){
                main(args);
                }
                else{
                }  
                
    }
}