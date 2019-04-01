package fabricaBolosBiscoitosDoces;

/**
 *
 * @author livia
 */
public class DoceAbobora extends Doces{

    protected DoceAbobora(DoceAbobora doceAbobora) {
        this.tipo = doceAbobora.getTipo();
    }
 
    public DoceAbobora() {
        tipo = "";
    }
    
    @Override
    public String exibirInfo() {
          return "Doce: Doce de abobora \n" + "Tipo: "
                + getTipo(); 
    }
    
    @Override
    public Doces clonar() {
     return new DoceAbobora(this);
    }
    
}
