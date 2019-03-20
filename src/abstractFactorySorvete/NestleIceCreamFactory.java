/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory;

/**
 *
 * @author livia
 */
public class NestleIceCreamFactory implements IceCreamFactory{

    @Override
    public ChocolateIceCream createChocolateIceCream() {
      return new ChocolateIceCreamNestle();
    }

    @Override
    public CreamIceCream createCreamIceCream() {
      return new CreamIceCreamNestle();
    }
    
}
