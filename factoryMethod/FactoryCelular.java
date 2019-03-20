package factoryMethod;

public class FactoryCelular {
 
    public Celular getCelular(String marca, String modelo) {
        if (marca.equals("Apple"))
            return new CelularApple(modelo);
        if (marca.equals("Motorola"))
            return new CelularMotorola(modelo);
        
        return null;
}
}
