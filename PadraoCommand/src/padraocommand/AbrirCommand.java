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
public class AbrirCommand implements Command{
    private Portao portao;

    public AbrirCommand(Portao portao){
        this.portao = portao;
    }

    

    public void execute(){
        portao.abrir();
    }

    public void desfazer(){
        portao.fechar();
    }
}
