package abstractFactory1Vinicius;

public class AcerAspire3  implements NotbookComum { 

    @Override
    public void exibirInfoNotbookComum() {
        
        System.out.println("Notebook comum Acer:");
        System.out.println("2GB Memoria, Processador I3");
        System.out.println("------------------------------");
        
    }
}
