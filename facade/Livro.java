package facade;

/**
 *
 * @author livia
 */
public class Livro {
    
    private boolean livro = true;
    
    public void verificarDisponibilidade(){
        if(livro = true){
            System.out.println("Livro dispon�vel.");   
        }    
        else{
            System.out.println("Livro indispon�vel no momento!");
        }
    }
    
    public void verificarQuantidade(){
        System.out.println("Verificando quantidade do livro no estoque...");
    }
    
}
