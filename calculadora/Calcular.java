package calculadora;

import java.util.Scanner;
/**
 *
 * @author livia
 */
public class Calcular {
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
       	int escolha;
        
            System.out.println(" Digite: \n 1 para realizar uma adição \n 2 para realizar uma subtração \n 3 para realizar uma multiplicação \n 4 para realizar uma divisão \n");
            escolha = input.nextInt();
            
		switch (escolha) {
		case 1:
			Adicao adicao = new Adicao();
			adicao.soma();
			break;
		case 2:
			Subtracao subtracao = new Subtracao();
			subtracao.subtracao();
			break;
		case 3:
			Multiplicacao multiplicacao = new Multiplicacao();
			multiplicacao.multiplicacao();
			break;
		case 4:
        		Divisao divisao = new Divisao();
			divisao.divisao();
			}
	}
}
