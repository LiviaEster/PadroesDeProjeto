package builder;

/**
 *
 * @author livia
 */
public class CasaLuxoBuilder extends CasaBuilder{

    @Override
    public void buildPrecoCasa() {
        casa.precoCasa = 1500000;
    }

    @Override
    public void buildAnoConstrucao() {
        casa.anoConstrucao = 2017;
    }

    @Override
    public void buildQtdComodos() {
        casa.qtdComodos = 15;
    }

    @Override
    public void buildBairro() {
        casa.bairro = "Condominio";
    }

    @Override
    public void buildExigencias() {
        casa.exigencias = "Piscina e area de churrasco";
    }
    
}
