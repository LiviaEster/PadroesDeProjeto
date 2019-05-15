package livrosBuilder;

/**
 *
 * @author livia
 */
public abstract class LivroBuilder {
    
    protected LivroProduct livro;
    
    public LivroBuilder(){
        livro = new LivroProduct();   
    }
    
   public abstract void buildPrecoLivro(); 
   
   public abstract void buildAnoEdicao();
   
   public abstract void buildQtdPaginas();
   
   public LivroProduct getLivro(){
       return livro;
   }
}
