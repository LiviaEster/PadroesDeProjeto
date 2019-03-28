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
public class ModeloCaro extends FabricaCelular{
    
    public ModeloCaro(String fabricante){
        this.fabricante = fabricante;
        System.out.println("modelo caro "+this.fabricante);
    }
}
