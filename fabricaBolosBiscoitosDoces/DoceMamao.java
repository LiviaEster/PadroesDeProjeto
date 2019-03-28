package fabricaBolosBiscoitosDoces;

/**
 *
 * @author livia
 */
public class DoceMamao extends Doces {
     protected DoceMamao(DoceMamao doceMamao) {
        this.tipo = doceMamao.getTipo();
    }
 
    public DoceMamao() {
        tipo = "";
    }
    
    @Override
    public String exibirInfo() {
          return "Doce: Doce de mamao \n" + "Tipo: "
                + getTipo(); 
    }

    @Override
    public Doces clonar() {
       return new DoceMamao(this);
    }
}
