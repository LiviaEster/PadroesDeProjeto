package singleton;

/**
 *
 * @author livia
 */
public class Main {
    public static void main(String[] args) {
        
         
    Usuario usuario1 =  Usuario.getInstancia();
    usuario1.nomeUsuario="Livia";
    usuario1.senha="123";
   
  
    System.out.println("Objeto: " + usuario1 + " Usuario: " + usuario1.nomeUsuario + " Senha: " + usuario1.senha);
    
    System.out.println("");
    
    Usuario usuario2 =  Usuario.getInstancia();
    usuario2.nomeUsuario="Livia Ester";
    usuario2.senha="1234567";
    
    System.out.println("Objeto: " + usuario2 + " Usuario: " + usuario2.nomeUsuario + " Senha: " + usuario2.senha);
}
}
