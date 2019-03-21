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
public class Aspire5Prototype extends NotebookPrototype {

    protected Aspire5Prototype(Aspire5Prototype aspire5Prototype) {
        this.valorNotebook = aspire5Prototype.getValorNotebook();
    }
 
    public Aspire5Prototype() {
        valorNotebook = 0.0;
    }
    
    @Override
    public String exibirInfo() {
    return "Modelo: Aspire5 \nMarca: Acer\n" + "Valor: R$"
                + getValorNotebook();
    }

    @Override
    public NotebookPrototype clonar() {
     return new Aspire5Prototype(this);
    }
    
}
