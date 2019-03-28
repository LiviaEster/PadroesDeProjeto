/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractyFactory2;

/**
 *
 * @author livia
 */
public class CelularesMotorolaFactory implements CelularFactory {

    @Override
    public CelularEmConta createCelularEmConta() {
         return new MotoG2();
    }

    @Override
    public CelularMaisCaro createCelularMaisCaro() {
          return new MotoZ3Play();
    }
    
}
