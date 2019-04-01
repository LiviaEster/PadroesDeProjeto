package fabricaBolosBiscoitosDoces;

/**
 *
 * @author livia
 */
public abstract class Doces {
    public String tipo;
        
    public abstract String exibirInfo();
 
    public abstract Doces clonar();
 
    public String getTipo() {
        return tipo;
    }
 
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
