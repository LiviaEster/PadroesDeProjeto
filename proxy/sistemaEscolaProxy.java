package proxy;

/**
 *
 * @author livia
 */

public class sistemaEscolaProxy extends sistemaEscola {

	protected String matricula, senha;

	public sistemaEscolaProxy(String matricula, String senha) {
		this.matricula = matricula;
		this.senha = senha;
	}

	@Override
	public String getNomeEscola() {
		if (temPermissaoDeAcesso()) {
			return super.getNomeEscola();
		}
		return null;
	}

	@Override
	public String getDadosAluno() {
		if (temPermissaoDeAcesso()) {
			return super.getDadosAluno();
		}
		return null;
	}

	private boolean temPermissaoDeAcesso() {
		return matricula == "2017" && senha == "123";
	}
}