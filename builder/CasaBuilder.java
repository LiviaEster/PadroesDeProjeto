package builder;

/**
 *
 * @author livia
 */
public abstract class CasaBuilder {
    
    protected CasaProduct casa;
    
    public CasaBuilder(){
        casa = new CasaProduct();   
    }
    
   public abstract void buildPrecoCasa(); 
   
   public abstract void buildAnoConstrucao();
   
   public abstract void buildQtdComodos();
   
   public abstract void buildBairro();
   
   public abstract void buildExigencias();
   
   public CasaProduct getCasa(){
       return casa;
   }
}