package facade;

/**
 *
 * @author livia
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Inicializando pedido...");   
        SistemaPedidoFacade facade = new SistemaPedidoFacade();
        facade.inicializarPedido();
        
        //CONSULTANDO FORMAS DE PAGAMENTOS
       // facade.consultarPagamento();
    }
    
}