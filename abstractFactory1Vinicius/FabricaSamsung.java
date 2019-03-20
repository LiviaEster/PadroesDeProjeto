
package abstractFactory1Vinicius;


public class FabricaSamsung implements FabricaNotebook{

    @Override
    public NotbookComum criarNotbookComum() {
    
         return new Samsung();
    }

    @Override
    public NotbookGamer crairNotbookGamer() {
    
         return null;
    }

    @Override
    public NotbookDesenvolverdor criaNotbookDesenvolvedor() {
          return new SamsungExpert();
    
    }

  
}
