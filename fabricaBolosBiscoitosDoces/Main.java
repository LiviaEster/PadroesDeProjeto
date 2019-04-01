package fabricaBolosBiscoitosDoces;

import java.util.Scanner;

/**
 *
 * @author livia
 */
public class Main {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
       	int escolha;
        int escolha2;
            System.out.println(" Digite: \n 1 para Bolos \n 2 para Biscoitos \n 3 para Doces \n");
            escolha = input.nextInt();
            
		switch (escolha) {
		case 1:
                System.out.println(" Digite: \n 1 para BoloChocolate \n 2 para BoloCenoura \n 3 para BoloLimao \n 4 para BoloLaranja \n");
                escolha2= input.nextInt();
                switch(escolha2)
                {
                    case 1:
			Bolos bolo = new BolosFactory();
                        BoloChocolate boloChocolate = bolo.createBoloChocolate();
                        boloChocolate.exibirInfoBolo();
			break;
                    case 2:
			Bolos bolo2 = new BolosFactory();
                        BoloCenoura boloCenoura = bolo2.createBoloCenoura();
                        boloCenoura.exibirInfoBolo();
			break;    
                    case 3:
			Bolos bolo3 = new BolosFactory();
                        BoloLimao boloLimao = bolo3.createBoloLimao();
                        boloLimao.exibirInfoBolo();
			break;    
                    case 4:
			Bolos bolo4 = new BolosFactory();
                        BoloLaranja boloLaranja = bolo4.createBoloLaranja();
                        boloLaranja.exibirInfoBolo();
			break;    
                                               
                }
                break;
                
                case 2:
		 System.out.println(" Digite: \n 1 para BiscoitoQueijo \n 2 para BiscoitoPolvilho \n 3 para BiscoitoChocolate \n 4 para BiscoitoFrito \n");
                escolha2= input.nextInt();
                switch(escolha2)
                {
                    case 1:
			BiscoitosFactory biscoito = new BiscoitosFactory();
                        String sabor = "Biscoito queijo";
                        String tamanho = "normal";
                        biscoito.getBiscoito(sabor, tamanho);
			break;
                        
                    case 2:
			BiscoitosFactory biscoito2 = new BiscoitosFactory();
                        String sabor2 = "Biscoito polvilho";
                        String tamanho2 = "normal";
                        biscoito2.getBiscoito(sabor2, tamanho2);
			break;    
                    case 3:
			BiscoitosFactory biscoito3 = new BiscoitosFactory();
                        String sabor3 = "Biscoito chocolate";
                        String tamanho3 = "normal";
                        biscoito3.getBiscoito(sabor3, tamanho3);
			break;    
                    case 4:
			BiscoitosFactory biscoito4 = new BiscoitosFactory();
                        String sabor4 = "Biscoito frito";
                        String tamanho4 = "normal";
                        biscoito4.getBiscoito(sabor4, tamanho4);
			break;    
                                               
                }
                break;
                
                case 3:
		System.out.println(" Digite: \n 1 para DoceAbobora \n 2 para DoceFigo \n 3 para DoceLeite \n 4 para DoceMamao \n");
                escolha2= input.nextInt();
                switch(escolha2)
                {
                    case 1:
                        DoceAbobora docesAbobora = new DoceAbobora();
                        Doces doceAbobora = docesAbobora.clonar();
                        doceAbobora.setTipo("industrializado");
      
                        System.out.println(doceAbobora.exibirInfo());
			break;
                        
                    case 2:
			DoceFigo docesFigo = new DoceFigo();
                        Doces doceFigo = docesFigo.clonar();
                        doceFigo.setTipo("caseiro");
      
                        System.out.println(doceFigo.exibirInfo());
			break;    
                    case 3:
			DoceLeite docesLeite = new DoceLeite();
                        Doces doceLeite = docesLeite.clonar();
                        doceLeite.setTipo("caseiro");
      
                        System.out.println(doceLeite.exibirInfo());
			break;    
                    case 4:
			DoceMamao docesMamao = new DoceMamao();
                        Doces doceMamao = docesMamao.clonar();
                        doceMamao.setTipo("industrializado");
      
                        System.out.println(doceMamao.exibirInfo());
			break;    
                                               
                }  
                                               
            }
	}
     
     /*
     //CRIANDO BOLOS (ABSTRACT FACTORY)
       Bolos bolo = new BolosFactory(); 
       BoloLimao boloLimao = bolo.createBoloLimao();
       boloLimao.exibirInfoBolo();
       
       System.out.println("-------------------------------------------------------");
       
       //CRIANDO BISCOITOS (FACTORY METHOD)
        BiscoitosFactory biscoito = new BiscoitosFactory();
        String sabor = "Biscoito queijo";
        String tamanho = "normal";
        biscoito.getBiscoito(sabor, tamanho);
        
       System.out.println("-------------------------------------------------------");
        
      //CRIANDO DOCES (PROTOTYPE) 
      DoceFigo docesFigo = new DoceFigo();
      DoceLeite docesLeite = new DoceLeite();
      
      Doces doceFigo = docesFigo.clonar();
      doceFigo.setTipo("caseiro");
      
      Doces doceLeite = docesLeite.clonar();
      doceLeite.setTipo("industrializado");
      
      System.out.println(doceFigo.exibirInfo());
      System.out.println(" ");
      System.out.println(doceLeite.exibirInfo()); 
     
     }
     */
    
}
