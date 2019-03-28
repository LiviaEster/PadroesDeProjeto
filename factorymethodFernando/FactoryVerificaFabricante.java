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
public class FactoryVerificaFabricante {
    
    public FabricaCelular getFabricaCelular(String fabricante, String modelo){
     
        if(fabricante.equals("a"))
         return new ModeloCaro(modelo);
        if(fabricante.equals("c"))
         return new ModeloBarato(modelo);
        
        //Novo modelo incrementado. Por: Lívia. 
        if(fabricante.equals("i"))
         return new ModeloIntermediario(modelo);
        
        return null;
    }
    
}
