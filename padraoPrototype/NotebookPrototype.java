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
public abstract class NotebookPrototype{
    
    public double valorNotebook;
        
    public abstract String exibirInfo();
 
    public abstract NotebookPrototype clonar();
 
    public double getValorNotebook() {
        return valorNotebook;
    }
 
    public void setValorNotebook(double valorNotebook) {
        this.valorNotebook = valorNotebook;
    }
}
