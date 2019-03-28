package fabricaBolosBiscoitosDoces;

/**
 *
 * @author livia
 */
public class DoceFigo extends Doces{

    protected DoceFigo(DoceFigo doceFigo) {
        this.tipo = doceFigo.getTipo();
    }
 
    public DoceFigo() {
        tipo = "";
    }
    
    @Override
    public String exibirInfo() {
          return "Doce: Doce de figo \n" + "Tipo: "
                + getTipo(); 
    }

    @Override
    public Doces clonar() {
       return new DoceFigo(this);
    }
    
}
