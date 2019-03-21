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
public class ClienteMain {
    public static void main(String[] args) {
        
    //Notebook Aspire5 da Acer    
    Aspire5Prototype prototipoAspire5 = new Aspire5Prototype();
 
    NotebookPrototype Aspire5Novo = prototipoAspire5.clonar();
    Aspire5Novo.setValorNotebook(3500.0);

    NotebookPrototype Aspire5Usado = prototipoAspire5.clonar();
    Aspire5Usado.setValorNotebook(2000.0);
 
    System.out.println(Aspire5Novo.exibirInfo());
    System.out.println(" ");
    System.out.println(Aspire5Usado.exibirInfo());
    System.out.println(" ");
    System.out.println("---------------------------------------------");
    System.out.println(" ");
    
    //Notebook DellG7 da Dell    
    DellG7Prototype prototipoDellG7 = new DellG7Prototype();
 
    NotebookPrototype DellG7Novo = prototipoDellG7.clonar();
    DellG7Novo.setValorNotebook(6500.0);
    NotebookPrototype DellG7Usado = prototipoDellG7.clonar();
    DellG7Usado.setValorNotebook(4000.0);
 
    System.out.println(DellG7Novo.exibirInfo());
    System.out.println(" ");
    System.out.println(DellG7Usado.exibirInfo());
    
    
}
}
