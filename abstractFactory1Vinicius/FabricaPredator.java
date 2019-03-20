
package abstractFactory1Vinicius;


public class FabricaPredator implements FabricaNotebook{

    @Override
    public NotbookComum criarNotbookComum() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public NotbookGamer crairNotbookGamer() {
    
      return new PredatorExpert();
              
    }

    @Override
    public NotbookDesenvolverdor criaNotbookDesenvolvedor() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
