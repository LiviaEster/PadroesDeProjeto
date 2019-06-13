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
public class PadraoCommand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Portao portao = new Portao();

        Command abrirCommand = new AbrirCommand(portao);
        Command fecharCommand = new FecharCommand(portao);
        
  Controle controle = new Controle(abrirCommand, fecharCommand);

        controle.abrirPortao();

        controle.fecharPortao();

        controle.desf();
    }
    }
    

