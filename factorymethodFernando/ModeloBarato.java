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
public class ModeloBarato extends FabricaCelular {
    
    public ModeloBarato(String fabricante){
        this.fabricante = fabricante;
        System.out.println("modelo barato "+this.fabricante);
    }
}
