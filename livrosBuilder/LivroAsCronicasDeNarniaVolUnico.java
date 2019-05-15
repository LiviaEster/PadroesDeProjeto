/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livrosBuilder;

/**
 *
 * @author livia
 */
public class LivroAsCronicasDeNarniaVolUnico extends LivroBuilder{
            
    @Override
    public void buildPrecoLivro() {
          livro.precoLivro = 60;
    }

    @Override
    public void buildAnoEdicao() {
         livro.anoEdicao = 2009;
    }

    @Override
    public void buildQtdPaginas() {
         livro.qtdPaginas = 751;
    }    
}
