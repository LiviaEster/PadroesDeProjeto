package livrosBuilder;

/**
 *
 * @author livia
 */
public class Main {
       public static void main(String[] args) {
        LivroDirector livraria = new LivroDirector(  
                new LivroOPequenoPrincipe());
        
        livraria.imprimirLivro();
        
        LivroProduct livro = livraria.getLivro();
           System.out.println("Livro: O Pequeno Pr�ncipe. "  +  livro.qtdPaginas + " paginas." + " Ano de publicacao: " + livro.anoEdicao +  ". Valor: " + livro.precoLivro);
       
       
           System.out.println("");  
            
        livraria = new LivroDirector( new LivroAsCronicasDeNarniaVolUnico());
        livraria.imprimirLivro();
        livro = livraria.getLivro();
        System.out.println("Livro: As Cr�nicas de N�rnia. " +  livro.qtdPaginas + " paginas." + " Ano de publicacao: " + livro.anoEdicao + " Valor: " + livro.precoLivro);       
}
}
