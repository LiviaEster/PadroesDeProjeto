package livrosBuilder;

/**
 *
 * @author livia
 */
public class LivroOPequenoPrincipe extends LivroBuilder{

    @Override
    public void buildPrecoLivro() {
      livro.precoLivro = 20;
    }

    @Override
    public void buildAnoEdicao() {
      livro.anoEdicao = 2017;
    }

    @Override
    public void buildQtdPaginas() {
      livro.qtdPaginas = 96;
    }
    
}
