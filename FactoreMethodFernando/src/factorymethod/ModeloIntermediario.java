/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author livia
 */
public class ModeloIntermediario extends FabricaCelular{
    
    public ModeloIntermediario(String fabricante){
        this.fabricante = fabricante;
        System.out.println("Modelo Intermediario: "+this.fabricante);
    }
}
