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
public class Main {
    public static void main(String[] args) {
    
    IceCreamFactory fabrica = new KibonIceCreamFactory();
    ChocolateIceCream sorveteChocolate = fabrica.createChocolateIceCream();
    //CreamIceCream sorveteCreme = fabrica.createCreamIceCream();
    sorveteChocolate.exibirInfoChocolateIceCream();
    
    fabrica = new NestleIceCreamFactory();
    
    CreamIceCream sorveteCreme2 = fabrica.createCreamIceCream();
    sorveteCreme2.exibirInfoCreamIceCream();
    System.out.println("");
 
    /*fabrica = new NestleIceCreamFactory();
    sorveteChocolate = fabrica.createChocolateIceCream();
    sorveteCreme = fabrica.createCreamIceCream();
    sorveteChocolate.exibirInfoChocolateIceCream();
    sorveteCreme.exibirInfoCreamIceCream();*/
}
}
