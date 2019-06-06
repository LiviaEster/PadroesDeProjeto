package proxy;
/**
 *
 * @author livia
 */
public class main {
	public static void main(String[] args) {
            
            //Matricula e senha incorreta.
		System.out.println("Matricula ou senha incorreta (Usúario impróprio acessando)");
		sistemaEscola escola = new sistemaEscolaProxy("2000", "1234");
		System.out.println(escola.getNomeEscola());
		System.out.println(escola.getDadosAluno());

            //Matricula e senha corretas. 
		System.out.println("\n Matricula e senha corretas (Usuário correto acessando)");
		escola = new sistemaEscolaProxy("2017", "123");
		System.out.println(escola.getNomeEscola());
		System.out.println(escola.getDadosAluno());
	}
}