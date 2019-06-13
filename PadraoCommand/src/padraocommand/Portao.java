/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraocommand;

/**
 *
 * @author Rafael
 */
public class Portao {
    public final static int aberto = 0;
    public final static int fechado = 1;

    private int estado = 0;

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void abrir(){
        this.estado = aberto;
        System.out.println("O portão abriu.");
    }

    public void fechar(){
        this.estado = fechado;
        System.out.println("O portão fechou.");
    }

    public String verEstado(){
        if(estado == aberto){
            return "O portão está aberto.";
        }else{
            return "O portão está fechado.";
        }
    }
}
