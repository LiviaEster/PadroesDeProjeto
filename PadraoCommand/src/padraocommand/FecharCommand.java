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
public class FecharCommand implements Command{
    private Portao portao;

    public FecharCommand(Portao portao){
        this.portao = portao;
    }

    public void execute(){
        portao.fechar();
    }

    public void desfazer(){
        portao.abrir();
    }
}
