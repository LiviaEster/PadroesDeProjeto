package livrosBuilder;

/**
 *
 * @author livia
 */
public class LivroDirector {
    protected LivroBuilder livraria;
    
    public LivroDirector(LivroBuilder livraria){
    this.livraria = livraria;
}
    public void imprimirLivro(){
        livraria.buildPrecoLivro();
        livraria.buildAnoEdicao();
        livraria.buildQtdPaginas();
    }
    
    public LivroProduct getLivro(){
        return livraria.getLivro();
    }
    
}
