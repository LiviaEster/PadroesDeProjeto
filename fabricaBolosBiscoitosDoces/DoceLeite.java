package fabricaBolosBiscoitosDoces;

/**
 *
 * @author livia
 */
public class DoceLeite extends Doces{

    protected DoceLeite(DoceLeite doceLeite) {
        this.tipo = doceLeite.getTipo();
    }
 
    public DoceLeite() {
        tipo = "";
    }
   
    @Override
    public String exibirInfo() {
    return "Doce: Doce de Leite \n" + "Tipo: "
                + getTipo(); 
    }

    @Override
    public Doces clonar() {
    return new DoceLeite(this);
    }
    
}
