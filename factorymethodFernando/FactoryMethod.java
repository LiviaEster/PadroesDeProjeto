/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author fernando
 */
public class FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FactoryVerificaFabricante celular = new FactoryVerificaFabricante();
        String fabricante = "a";
        String modelo = "IPhone";
        celular.getFabricaCelular(fabricante, modelo);
        
        //Teste incrementação Lívia
        FactoryVerificaFabricante celular2 = new FactoryVerificaFabricante();
        String fabricante2 = "i";
        String modelo2 = "Moto X4";
        celular2.getFabricaCelular(fabricante2, modelo2);
        
    }
    
}
