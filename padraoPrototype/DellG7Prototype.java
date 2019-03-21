/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoPrototype;

/**
 *
 * @author livia
 */
public class DellG7Prototype extends NotebookPrototype{
    
    protected DellG7Prototype(DellG7Prototype dellG7Prototype) {
        this.valorNotebook = dellG7Prototype.getValorNotebook();
    }
 
    public DellG7Prototype() {
        valorNotebook = 0.0;
    }
    
    @Override
    public String exibirInfo() {
    return "Modelo: DellG7 \nMarca: Dell \n" + "Valor: R$"
                + getValorNotebook();
    }

    @Override
    public DellG7Prototype clonar() {
     return new DellG7Prototype(this);
    }
}
