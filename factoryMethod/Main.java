package factoryMethod;

public class Main {
     
    public static void main(String args[]) {
        
        //Celular Motorola
        FactoryCelular factory = new FactoryCelular();
        String marca = "Motorola";
        String modelo = "Moto X4 ";
        factory.getCelular(marca, modelo);
        
        //Celular Apple
        FactoryCelular factory2 = new FactoryCelular();
        String marca2 = "Apple";
        String modelo2 = "iPhone X";
        factory2.getCelular(marca2, modelo2);
        
    }
}
