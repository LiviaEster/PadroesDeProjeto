package fabricaBolosBiscoitosDoces;

/**
 *
 * @author livia
 */
public class BiscoitosFactory {
 public Biscoito getBiscoito(String sabor,String tamanho) {
        if (sabor.equals("Biscoito queijo"))
            return new BiscoitoQueijo(tamanho);
        if (sabor.equals("Biscoito polvilho"))
            return new BiscoitoPolvilho(tamanho);
        if (sabor.equals("Biscoito chocolate"))
            return new BiscoitoChocolate(tamanho);
        if (sabor.equals("Biscoito frito"))
            return new BiscoitoFrito(tamanho);
        
        return null;    
}
}