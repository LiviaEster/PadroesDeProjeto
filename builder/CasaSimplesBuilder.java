package builder;

/**
 *
 * @author livia
 */
public class CasaSimplesBuilder extends CasaBuilder{

    @Override
    public void buildPrecoCasa() {
        casa.precoCasa = 200000;
    }

    @Override
    public void buildAnoConstrucao() {
       casa.anoConstrucao = 2016;
    }

    @Override
    public void buildQtdComodos() {
       casa.qtdComodos = 7;
    }

    @Override
    public void buildBairro() {
       casa.bairro = "Centro";
    }
    
    //Não tem exigencias.
    @Override
    public void buildExigencias() {
    }
    
}
