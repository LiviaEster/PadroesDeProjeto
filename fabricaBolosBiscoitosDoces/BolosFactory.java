package fabricaBolosBiscoitosDoces;

/**
 *
 * @author livia
 */
public class BolosFactory implements Bolos{

    @Override
    public BoloChocolate createBoloChocolate() {
    return new BoloChocolate();
    }

    @Override
    public BoloCenoura createBoloCenoura() {
      return new BoloCenoura();
    }

    @Override
    public BoloLaranja createBoloLaranja() {
      return new BoloLaranja();
    }

    @Override
    public BoloLimao createBoloLimao() {
      return new BoloLimao();
    }
    
}
