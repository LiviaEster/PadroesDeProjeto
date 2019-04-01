package builder;

/**
 *
 * @author livia
 */
public class Main {
       public static void main(String[] args) {
        CasaDirector construtora = new CasaDirector(  
                new CasaLuxoBuilder());
        
        construtora.construirCasa();
        
        CasaProduct casa = construtora.getCasa();
           System.out.println("Casa: " + casa.qtdComodos + " comodos." + " Ano de construcao: " + casa.anoConstrucao + ". Bairro: " + casa.bairro + ". Exigencias: " + casa.exigencias + ". Valor: " + casa.precoCasa);
       
       
           System.out.println("");  
            
        construtora = new CasaDirector(new CasaSimplesBuilder());
        construtora.construirCasa();
        casa = construtora.getCasa();
        System.out.println("Casa: " + casa.qtdComodos + " comodos." + " Ano de construcao: " + casa.anoConstrucao + ". Bairro: " + casa.bairro +  " Valor: " + casa.precoCasa);       
}
}
