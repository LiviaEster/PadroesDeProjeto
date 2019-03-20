package factoryMethod;

public class CelularMotorola extends Celular {
     
    public CelularMotorola(String modelo) {
    this.modelo = modelo;
    System.out.println("Celular Motorola. Modelo: " + this.modelo);
  
}
}
