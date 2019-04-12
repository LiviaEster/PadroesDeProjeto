package singleton;

/**
 *
 * @author livia
 */
 public class Usuario {
   public static Usuario instancia;
    
    protected String nomeUsuario;
    protected String senha;
        
    protected Usuario(){
    }

     public static Usuario getInstancia() {
        if (instancia==null)
        instancia = new Usuario();  
        
        return instancia;
        
        }
    }
