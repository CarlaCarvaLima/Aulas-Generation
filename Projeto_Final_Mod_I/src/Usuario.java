import java.util.Scanner;

public class Usuario {
	
	private String adm;
	private String senhaAdm;
	private String cliente;
	private String senhaCliente;
	
	int [] listaAkira = new int[]{1,2,3,4,5,6};
	
	int[] listaRedGarden = new int[]{1,2,3,4};
	
	int[] listaAfroSamurai = new int[]{1,2};
	
	int[] listaKilllaKill = new int[]{1,2,3};
	
	int[] listaBlackLagoon = new int[]{1,2,3,4,5,6,7,8,9};
	
	Scanner leia = new Scanner(System.in);
	
	int contAfro1 = 0;
	int contAfro2 = 0;
	int somaContadores;
	float somaValor;
	
	public Usuario () {
		
		super();
		this.adm = adm;
		this.senhaAdm = senhaAdm;
		this.cliente = cliente;
		this.senhaCliente = cliente;
	}
	
	public void telaInicial() {
		System.out.println("\t\tLoja ?????\t\n\n *** Bem vinde a nossa loja de mangás! ***\n\n Você pode fazer o seu login digitando (0).\n Ou apenas dar uma olhadinha em nossos produtos digitando (1).");
	}
	    
    public void escolheLoginouCatalogo() {
    
    	int a = leia.nextInt();	
    	switch(a) {
    	case 0: System.out.printf("Usuário: ");
    	adm = leia.nextLine();
    	System.out.printf("Senha: ");
    	senhaAdm = leia.nextLine();
    	break;
    	
    	case 1: System.out.println("Essa é o nosso catálogo. Escolha o título desejado para verificar os volumes disponíveis.");break;
    	}
    }
    	
    public void menuTitulos() {
    	
    	System.out.println("\n\n\t Títulos\n");
    	System.out.println(" Afro Samurai --> digite (1)\n\n Akira --> digite (2)\n\n Black Lagoon --> digite (3)\n\n Kill la Kill --> digite (4)\n\n Red Garden --> digite (5)");
    	escolheTitulo();
    	
    }
    
    public void escolheTitulo() {
    	    	
    	int a = leia.nextInt();
    	do {
    		
	    	switch(a) {
	    	case 1: System.out.println("\n\n\t *** Afro Samurai ***\n\n Para escolher um volume, basta digitar seu número.\n Exemplo: Se você quiser o volume 4, digite 4. \n");
	    	System.out.println(" Caso queira retornar ao menu de títulos ou finalizar o pedido, digite (3)\n\n");
	    	System.out.println("\tVolumes disponíveis\n");
		    System.out.println(" Volume " +listaAfroSamurai[0] + " \tVolume " +listaAfroSamurai[1]);
			    int b = leia.nextInt();
				switch(b) {
				case 1: System.out.println("Você adicionou o volume 1 de Afro Samurai ao carrinho");
						contAfro1++;
				break;
				case 2: System.out.println("Você adicionou o volume 2 de Afro samurai ao carrinho");
						contAfro2++;
				break;
				case 3: a=2147;  break;
				default: System.out.println("linha72");
				
			 }
				break;
			 	
    		
    	case 2: System.out.println("\n\n\t *** Akira ***\n\n Para escolher um volume, basta digitar seu número.\n Exemplo: Se você quiser o volume 4, digite 4. \n\n");
		System.out.println("\tVolumes disponíveis\n");
	    System.out.println(" Volume " +listaAkira[0] + " \tVolume " +listaAkira[1] + " \tVolume " +listaAkira[2] + " \tVolume " +listaAkira[3] + " \tVolume " +listaAkira[4] + " \tVolume " +listaAkira[5]);
	    	int c = leia.nextInt();
				switch(c) {
				case 1: System.out.println("Você adicionou o volume 1 de Akira ao carrinho");break;
				case 2: System.out.println("Você adicionou o volume 2 de Akira ao carrinho");break;
				case 3: System.out.println("Você adicionou o volume 3 de Akira ao carrinho");break;
				case 4: System.out.println("Você adicionou o volume 4 de Akira ao carrinho");break;
				case 5: System.out.println("Você adicionou o volume 5 de Akira ao carrinho");break;
				case 6: System.out.println("Você adicionou o volume 6 de Akira ao carrinho");break;
				case 7: a=2147; break;
				default: System.out.println("Oops! Algo deu errado...linha 91");
				}					
	    break;
	    default: OpcaoComprando_finalizarCompra() ;break;	
	    }
	    	
    	}while(a!=0);
         
    }
    
    public void OpcaoComprando_finalizarCompra() {
    	
    	System.out.println("\n Para voltar ao menu, digite (4) \n Para finalizar a sua compra, digite (1)\n Para visualizar seu carrinho, digite (2)");		
    	
    	int a = leia.nextInt();
    	switch(a) {
    	case 4: menuTitulos();break;
    	case 1: finalizaCompra();break; 
    	case 2: somaCarrinho(); break;
    	}
    	
    }
    
    public void finalizaCompra() {
    	
    	System.out.println("Você comprou "+somaContadores+" mangás e o valor total é R$"+somaValor);
    	System.out.println("Sua compra foi finalzada!");
    }
    
    public void somaCarrinho() {
    	
    	 somaContadores = contAfro1+contAfro2;
    	System.out.println("Total de produtos: "+somaContadores);
    	somaValor = (somaContadores*10);
    	System.out.println("O valor total da sua compra é de: R$"+somaValor);
    }
    

}
