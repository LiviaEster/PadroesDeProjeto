package proxy;

/**
 *
 * @author livia
 */public class sistemaEscola {
	private String nomeEscola;
	private String dadosAluno;

	public sistemaEscola() {
		nomeEscola = "\n IFGoiano \n";
		dadosAluno = "\n Mat�rias: - - - - - - - \n Notas: - - - - - - - \n Boletim: - - - - - - -";
                       
	}

	public String getNomeEscola() {
		return new String("Escola: " + nomeEscola);
	}

	public String getDadosAluno() {
		return new String("Dados do Aluno: " + dadosAluno);
	}
}