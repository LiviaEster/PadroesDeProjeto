
package abstractFactory1Vinicius;


public class Cliente{
    
   public static void main(String[] args) {
    
       FabricaNotebook tipo = new FabricaSamsung(); //fabrica de not 1
       NotbookComum notComum = tipo.criarNotbookComum(); //recebe a criação 
       NotbookDesenvolverdor notDesenvolvimento =  tipo.criaNotbookDesenvolvedor(); // o objetivo foi mostrar 

       notComum.exibirInfoNotbookComum(); // pede para informar
       notDesenvolvimento.exibirinfoNotbookDesenvolvedor(); //informa 
        
        
       FabricaNotebook tipo2 = new FabricaPredator(); // fabrica de not 2
       NotbookGamer notGamer = tipo2.crairNotbookGamer();
       notGamer.exibirNotbookGamer();
       
       //NOTEBOOK ACER 
       FabricaNotebook acer = new FabricaAcer();
       NotbookGamer notebookGamer = acer.crairNotbookGamer();
       notebookGamer.exibirNotbookGamer();
    }
    
    
}
