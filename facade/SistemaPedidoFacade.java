package facade;

/**
 *
 * @author livia
 */
public class SistemaPedidoFacade {
    protected Cliente cliente;
    protected Livro livro;
    protected Pagamento pagamento;
    
    
    public void inicializarPedido(){
        livro = new Livro();
        livro.verificarDisponibilidade();
        livro.verificarQuantidade();
        
        cliente = new Cliente();
        cliente.verificarCadastro();
        cliente.verificarUltimasCompras();
        
        pagamento = new Pagamento();
        pagamento.calcularValorTotal();
        pagamento.consultarFormasPagamento();
    }
    
    public void consultarPagamento(){
        pagamento.consultarFormasPagamento();
    }
    
    public void finalizarPedido(){
       inicializarPedido();
        System.out.println("Finalizando pedido...");
        System.out.println("Pedido finalizado.");
    }
}
