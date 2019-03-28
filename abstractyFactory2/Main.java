package abstractyFactory2;

public class Main {
     public static void main(String[] args) {
         
    CelularFactory fabricaDeCelulares = new CelularesMotorolaFactory(); //FABRICA DA MOTOROLA
    CelularFactory fabricaDeCelulares2 = new CelularesSamsungFactory(); //FABRICA DA SAMSUNG
    CelularFactory fabricaDeCelulares3 = new CelularesAppleFactory();   //FABRICA DA APPLE
    
    //Celular caro MOTOROLA
    CelularMaisCaro celularCaro = fabricaDeCelulares.createCelularMaisCaro();
    celularCaro.exibirInfoCelularMaisCaro();
    
    //Celular caro MOTOROLA
    CelularEmConta celular1 = fabricaDeCelulares.createCelularEmConta();
    celular1.exibirInfoCelularMaisEmConta();
    System.out.println("");
    
    //Celular barato SAMSUNG
    CelularEmConta celularBarato = fabricaDeCelulares2.createCelularEmConta();
    celularBarato.exibirInfoCelularMaisEmConta();
    
    //Celular barato SAMSUNG
    CelularMaisCaro celular2 = fabricaDeCelulares2.createCelularMaisCaro();
    celular2.exibirInfoCelularMaisCaro();
    System.out.println("");
    
    //Celulares APPLE
    CelularMaisCaro celular3 = fabricaDeCelulares3.createCelularMaisCaro();
    celular3.exibirInfoCelularMaisCaro();
    
    CelularEmConta celular4= fabricaDeCelulares3.createCelularEmConta();
    celular4.exibirInfoCelularMaisEmConta();
    }
}
