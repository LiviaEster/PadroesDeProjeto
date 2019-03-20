package abstractFactory1Vinicius;

public class FabricaAcer implements FabricaNotebook{

    @Override
    public NotbookComum criarNotbookComum() {
        return new AcerAspire3();
    }

    @Override
    public NotbookGamer crairNotbookGamer() {
    
      return new AcerGamerAspireNitro();
              
    }
    @Override
    public NotbookDesenvolverdor criaNotbookDesenvolvedor() {
        return new AcerAspire5();
    }
    
}    
