package builder;

/**
 *
 * @author livia
 */
public class CasaDirector {
    protected CasaBuilder construtora;
    
    public CasaDirector(CasaBuilder construtora){
    this.construtora = construtora;
}
    public void construirCasa(){
        construtora.buildPrecoCasa();
        construtora.buildAnoConstrucao();
        construtora.buildQtdComodos();
        construtora.buildBairro();
        construtora.buildExigencias();
    }
    
    public CasaProduct getCasa(){
        return construtora.getCasa();
    }
    
}
