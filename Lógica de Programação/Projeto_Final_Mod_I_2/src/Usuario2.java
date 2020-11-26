import java.util.*;
public class Usuario2 {
	
	private String adm;
	private String senhaAdm;
	private String cliente;
	private String senhaCliente;
	
	String [] listaAkira = new String[]{"Vol.1","Vol.2","Vol.3","Vol.4","Vol.5","Vol.6"};
	
	String[] listaRedGarden = new String[] {"Vol.1","Vol.2","Vol.3","Vol.4"};
	
	String[] listaAfroSamurai = new String[]{"Vol.1","Vol.2"};
	
	String[] listaKilllaKill = new String[]{"Vol.1","Vol.2","Vol.3"};
	
	String[] listaBlackLagoon = new String[]{"Vol.1","Vol.2","Vol.3","Vol.4","Vol.5","Vol.6","Vol.7","Vol.8","Vol.9"};
	
	String[] listaTitulos = new String[] {"Afro Samurai","Akira","Black Lagoon","Kill la Kill","Red Garden"};
	
	 Scanner leia = new Scanner(System.in);
	
	double somaContadores;
	double somaValor;
	
	int contAfro1=0, contAfro2=0;
	int contAkira1=0, contAkira2=0, contAkira3=0, contAkira4=0, contAkira5=0, contAkira6=0;
	int contBlack1=0, contBlack2=0, contBlack3=0, contBlack4=0, contBlack5=0, contBlack6=0, contBlack7=0, contBlack8=0, contBlack9=0;
	int contKill1=0,contKill2=0,contKill3=0;
	int contRed1=0, contRed2=0, contRed3=0, contRed4=0;
	
 	double precoAfro = 10;
	double precoAkira = 15;
	double precoBlack = 12.90;
	double precoKill = 8.50;
	double precoRed = 14.30;
	
	double cred1;
	double cred2;
	double cred3;
	double bol;
	
	public Usuario2() {
		
		super();
		this.adm = adm;
		this.senhaAdm = senhaAdm;
		this.cliente = cliente;
		this.senhaCliente = cliente;
	}
		
		public void telaInicial() {
			System.out.println("\t\tLoja ?????\t\n\n *** Bem vinde a nossa loja de mangás! ***\n\n Você pode fazer o seu login digitando (0).\n Ou apenas dar uma olhadinha em nossos produtos digitando (1).");
		    escolheLoginouCatalogo();
	
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
		    	
		    	menuTitulos();
		    }
		    	
		    public void menuTitulos() {
		    	
		    	System.out.println("\n\n\t Títulos\n");
		    	System.out.println( listaTitulos[0]+ "--> digite (1)\n\n"+ listaTitulos[1] +"--> digite (2)\n\n"+ listaTitulos[2] +"--> digite (3)\n\n"+ listaTitulos[3] +"--> digite (4)\n\n"+ listaTitulos[4] +"--> digite (5)");
		    	System.out.println("\n Caso deseje voltar para a tela Inicial, digite (6)");
		    	escolheTitulo();
		    }
		    
		    public void escolheTitulo() {    	
		   	
		    	int a = leia.nextInt();
		    	do {
		    		
			    	switch(a) {
			    	case 1: System.out.println("\n\n\t *** "+listaTitulos[0] + " ***\n\n Para escolher um volume, basta digitar seu número.\n Exemplo: Se você quiser o volume 4, digite 4. \n");
			    	System.out.println(" Caso queira retornar ao menu de títulos ou finalizar o pedido, digite (3)\n\n");
			    	System.out.println("\tVolumes disponíveis\n");
				    System.out.println(" Volume " +listaAfroSamurai[0] + " R$ "+ precoAfro +" \tVolume " +listaAfroSamurai[1] + " R$ "+ precoAfro);
					    int b = leia.nextInt();
						switch(b) {
						case 1: System.out.println("Você adicionou o volume 1 de Afro Samurai ao carrinho");
								contAfro1++;
								break;
			    	
						case 2: System.out.println("Você adicionou o volume 2 de Afro Samurai ao carrinho");
								contAfro2++;
								break;
								
						case 3: b=0;
								a=0;
						OpcaoComprando_finalizarCompra();
						break;
						default: System.out.println("erro case 1");
						
					 }
						break;
						
		    	case 2: System.out.println("\n\n\t ***" +listaTitulos[1]+" ***\n\n Para escolher um volume, basta digitar seu número.\n Exemplo: Se você quiser o volume 4, digite 4. \n\n");
		    	System.out.println(" Caso queira retornar ao menu de títulos ou finalizar o pedido, digite (7)\n\n");
		    	System.out.println("\tVolumes disponíveis\n");
			    System.out.println(" Volume " +listaAkira[0] +" R$"+ precoAkira + " \tVolume " +listaAkira[1] +" R$"+ precoAkira +" \tVolume " +listaAkira[2] +" R$"+precoAkira + " \n\nVolume " +listaAkira[3] +" R$"+precoAkira + " \tVolume " +listaAkira[4]+ " R$"+precoAkira + " \tVolume " +listaAkira[5]+" R$"+precoAkira);
			    	int c = leia.nextInt();
						switch(c) {
						case 1: System.out.println("Você adicionou o volume 1 de Akira ao carrinho");
						contAkira1++;
						
						break;
						case 2: System.out.println("Você adicionou o volume 2 de Akira ao carrinho");
						contAkira2++;
						
						break;
						case 3: System.out.println("Você adicionou o volume 3 de Akira ao carrinho");
						contAkira3++;
						
						break;
						case 4: System.out.println("Você adicionou o volume 4 de Akira ao carrinho");
						contAkira4++;
					
						break;
						
						case 5: System.out.println("Você adicionou o volume 5 de Akira ao carrinho");
						contAkira5++;
						
						break;
						case 6: System.out.println("Você adicionou o volume 6 de Akira ao carrinho");
						contAkira6++;
						
						break;
						case 7: c=0;
								a=0;
						OpcaoComprando_finalizarCompra();
						break;
						default: System.out.println("Oops! Algo deu errado...case 2");
						} break;
			    
		    	case 3:  System.out.println("\n\n\t *** "+listaTitulos[2]+" ***\n\n Para escolher um volume, basta digitar seu número.\n Exemplo: Se você quiser o volume 4, digite 4. \n\n");
		    	System.out.println(" Caso queira retornar ao menu de títulos ou finalizar o pedido, digite (10)\n\n");
		    	System.out.println("\tVolumes disponíveis\n");
			    System.out.println(" Volume " +listaBlackLagoon[0] +" R$"+ precoBlack + " \tVolume " +listaBlackLagoon[1] +" R$"+ precoBlack + " \tVolume " +listaBlackLagoon[2] +" R$"+ precoBlack + " \tVolume " +listaBlackLagoon[3]+" R$"+ precoBlack + " \tVolume " +listaBlackLagoon[4]+" R$"+ precoBlack + "\n\n Volume " +listaBlackLagoon[5]+" R$"+ precoBlack + " \tVolume " +listaBlackLagoon[6]+" R$"+ precoBlack + " \tVolume " +listaBlackLagoon[7]+" R$"+ precoBlack + " \tVolume " +listaBlackLagoon[8]+" R$"+ precoBlack);
			    	int d = leia.nextInt();
						switch(d) {
						case 1: System.out.println("Você adicionou o volume 1 de Black Lagoon ao carrinho");
						contBlack1++;
						
						break;
						case 2: System.out.println("Você adicionou o volume 2 de Black Lagoon ao carrinho");
						contBlack2++;
						
						break;
						case 3: System.out.println("Você adicionou o volume 3 de Black Lagoon ao carrinho");
						contBlack3++;
						
						break;
						case 4: System.out.println("Você adicionou o volume 4 de Black Lagoon ao carrinho");
						contBlack4++;
						
						break;
						case 5: System.out.println("Você adicionou o volume 5 de Black Lagoon ao carrinho");
						contBlack5++;
						
						break;
						case 6: System.out.println("Você adicionou o volume 6 de Black Lagoon ao carrinho");
						contBlack6++;
					
						break;
						case 7: System.out.println("Você adicionou o volume 7 de Black Lagoon ao carrinho");
						contBlack7++;
						
						break;
						case 8: System.out.println("Você adicionou o volume 8 de Black Lagoon ao carrinho");
						contBlack8++;
						
						break;
						case 9: System.out.println("Você adicionou o volume 9 de Black Lagoon ao carrinho");
						contBlack9++;
						
						break;
						case 10: d=0;
								a=0;
						OpcaoComprando_finalizarCompra();
						break;
						default: System.out.println("Oops! Algo deu errado...case 3");
						}break;					
						
		    	case 4: System.out.println("\n\n\t *** "+listaTitulos[3]+" ***\n\n Para escolher um volume, basta digitar seu número.\n Exemplo: Se você quiser o volume 4, digite 4. \n\n");
		    	System.out.println(" Caso queira retornar ao menu de títulos ou finalizar o pedido, digite (4)\n\n");
		    	System.out.println("\tVolumes disponíveis\n");
			    System.out.println(" Volume " +listaKilllaKill[0] +" R$"+ precoKill + " \tVolume " +listaKilllaKill[1] +" R$"+ precoKill + " \t\tVolume " +listaKilllaKill[2]+" R$"+ precoKill );
			    	int e = leia.nextInt();
						switch(e) {
						case 1: System.out.println("Você adicionou o volume 1 de Kill la Kill ao carrinho");
						contKill1++;
						
						break;
						case 2: System.out.println("Você adicionou o volume 2 de Kill la Kill ao carrinho");
						contKill2++;
						
						break;
						case 3: System.out.println("Você adicionou o volume 3 de Kill la Kill ao carrinho");
						contKill3++;
						
						break;
						case 4: e=0;
								a=0;
						OpcaoComprando_finalizarCompra();
						break;
						default: System.out.println("Oops! Algo deu errado...case 4");
						}break;	
						
		    	case 5:  System.out.println("\n\n\t *** "+listaTitulos[4]+" ***\n\n Para escolher um volume, basta digitar seu número.\n Exemplo: Se você quiser o volume 4, digite 4. \n\n");
		    	System.out.println(" Caso queira retornar ao menu de títulos ou finalizar o pedido, digite (5)\n\n");
		    	System.out.println("\tVolumes disponíveis\n");
			    System.out.println(" Volume " +listaRedGarden[0] +" R$"+ precoRed + " \tVolume " +listaRedGarden[1] +" R$"+ precoRed + " \tVolume " +listaRedGarden[2] +" R$"+ precoRed + " \tVolume " +listaRedGarden[3]+" R$"+ precoRed );
			    	int f = leia.nextInt();
						switch(f) {
						case 1: System.out.println("Você adicionou o volume 1 de Red Garden ao carrinho");
						contRed1++;
						
						break;
						case 2: System.out.println("Você adicionou o volume 2 de Red Garden ao carrinho");
						contRed2++;
						
						break;
						case 3: System.out.println("Você adicionou o volume 3 de Red Garden ao carrinho");
						contRed3++;
						
						break;
						case 4: System.out.println("Você adicionou o volume 4 de Red Garden ao carrinho");
						contRed4++;
						
						break;
						case 5: f=0; 
								a=0;
						OpcaoComprando_finalizarCompra();
						break;
						default: System.out.println("Oops! Algo deu errado...case 5");
						}break;		
						
		    			case 6: telaInicial();break;
		    	    
			    default: System.out.println("oops..."); break;	
			    
			    }
			    	
		    	}while(a!=0);  	
		         
		    }
		    
		    public void OpcaoComprando_finalizarCompra() {
		    	
		    	System.out.println("\n\n Para voltar ao menu, digite (4) \n Para finalizar a sua compra, digite (1)\n Para visualizar seu carrinho, digite (2)");		
		    	
		    	int a = leia.nextInt();
		    	switch(a) {
		    	case 4: menuTitulos();break;
		    	case 1: finalizaCompra();break; 
		    	case 2: Carrinho(); break;
		    	}
		    	
		    }
		    
		       
		    public void credito1() {
		    	
		    	 cred1 = somaValor;
		    	
		    	System.out.println("O valor total a ser pago é de: R$"+cred1+" em 1 parcela");
		    }
		    
		    public void credito2() {
		    	
		    	cred2 = somaValor+(somaValor*0.10);
		    	
		    	System.out.println("O valor total a ser pago é de: R$"+cred2+" em 2 parcelas de R$"+(cred2/2));
		    }
		    
		    public void credito3() {
		    	
		    	cred3 = somaValor+(somaValor*0.15);
		    	
		    	System.out.println("O valor total a ser pago é de: R$"+ cred3+" em 3 parcelas de R$"+(cred3/3));
		    }
		    
		    public void boleto() {
		    	
		    	bol = somaValor-(somaValor*0.10);
		    	
		    	System.out.println("O valor total a ser pago é de: R$"+bol);
		    }
		    
		    public void finalizaCompra() {
		    	
		    
		    	System.out.println("\n Você comprou "+somaContadores+" mangás e o valor total é R$"+somaValor);
		    	System.out.println("\n Como deseja realizar o pagamento?\n Cartão de crédito em 1 vez sem juros --> Digite (1) "
		    			+ "\n Cartão de crédito em 2 vezes com juros de 10% --> Digite (2) \n Cartão de crédito em 3 vezes com juros de 15% --> Digite (3) "
		    			+ "\n Boleto Bancário com desconto de 10% --> Digite (4)");
		    	int a = leia.nextInt();
		    	switch(a) {
		    	case 1: credito1();break;
		    	case 2: credito2();break;
		    	case 3: credito3();break;
		    	case 4: boleto();break;
		    	default: System.out.println("Oops...em finaliza compra...");
		    	
		    	}
		    	
		    	System.out.printf("\n Deseja efetuar o pagamento?");
		    	System.out.printf("\n Sim --> (1) \t Não --> (2)");
		    	int b = leia.nextInt();
		    	switch(b) {
		    	case 1: System.out.println("\nUhuuuu! Compra efetuada!");break;
		    	case 2: finalizaCompra();break;
		    	default: System.out.println("Oops...em finaliza compra...");break;
		    	}
		    	System.out.println("\n Sua compra foi finalzada!\n  Deseja voltar a tela Inicial?\n Sim --> (1) \t\t Não --> (2)");
		    	int c = leia.nextInt();
		    	switch(c) {
		    	case 1: telaInicial();break;
		    	case 2: System.out.println("\n Ok! Agradecemos pela sua compra! Volte em breve!");break;
		    	default: System.out.println("Oops...em finaliza compra...");break;
		    	}
		    }
		    
		    public void Carrinho() {
		    	
		    	 somaContadores = contAfro1+contAfro2+contAkira1+contAkira2+contAkira3+contAkira4+contAkira5+
		    			 contAkira6+contBlack1+contBlack2+contBlack3+contBlack4+contBlack5+contBlack6+contBlack7+
		    			 contBlack8+contBlack9+contKill1+contKill2+contKill3+contRed1+contRed2+contRed3+contRed4;
		    	 
		    	
		    	 System.out.println("\n Total de produtos: "+somaContadores);
		    	 
		    	
		    	 
		    	 System.out.println("\n Itens no carrinho: \n");
		    	 if(contAfro1!=0) {
		    		 System.out.println(listaTitulos[0]+" "+listaAfroSamurai[0]+" --> Qt. "+contAfro1);}
		    	 if(contAfro2!=0) {
		    		 System.out.println(listaTitulos[0]+" "+listaAfroSamurai[1]+" --> Qt.  "+contAfro2);}
		    	 if(contAkira1!=0) {
		    		 System.out.println(listaTitulos[1]+" "+listaAkira[0]+" --> Qt.  "+contAkira1);}	    		 
		    	 if(contAkira2!=0) {
		    		 System.out.println(listaTitulos[1]+" "+listaAkira[1]+" --> Qt.  "+contAkira2);}	
		    	 if(contAkira3!=0) {
		    		 System.out.println(listaTitulos[1]+" "+listaAkira[2]+" --> Qt.  "+contAkira3);}	
		    	 if(contAkira4!=0) {
		    		 System.out.println(listaTitulos[1]+" "+listaAkira[3]+" --> Qt.  "+contAkira4);}	
		    	 if(contAkira5!=0) {
		    		 System.out.println(listaTitulos[1]+" "+listaAkira[4]+" --> Qt.  "+contAkira5);}	
		    	 if(contAkira6!=0) {
		    		 System.out.println(listaTitulos[1]+" "+listaAkira[5]+" --> Qt.  "+contAkira6);}	
		    	 if(contBlack1!=0) {
		    		 System.out.println(listaTitulos[2]+" "+listaBlackLagoon[0]+" --> Qt.  "+contBlack1);}	
		    	 if(contBlack2!=0) {
		    		 System.out.println(listaTitulos[2]+" "+listaBlackLagoon[1]+" --> Qt.  "+contBlack2);}	
		    	 if(contBlack3!=0) {
		    		 System.out.println(listaTitulos[2]+" "+listaBlackLagoon[2]+" --> Qt.  "+contBlack3);}	
		    	 if(contBlack4!=0) {
		    		 System.out.println(listaTitulos[2]+" "+listaBlackLagoon[3]+" --> Qt.  "+contBlack4);}	
		    	 if(contBlack5!=0) {
		    		 System.out.println(listaTitulos[2]+" "+listaBlackLagoon[4]+" --> Qt.  "+contBlack5);}	
		    	 if(contBlack6!=0) {
		    		 System.out.println(listaTitulos[2]+" "+listaBlackLagoon[5]+" --> Qt.  "+contBlack6);}	
		    	 if(contBlack7!=0) {
		    		 System.out.println(listaTitulos[2]+" "+listaBlackLagoon[6]+" --> Qt.  "+contBlack7);}	
		    	 if(contBlack8!=0) {
		    		 System.out.println(listaTitulos[2]+" "+listaBlackLagoon[7]+" --> Qt.  "+contBlack8);}	
		    	 if(contBlack9!=0) {
		    		 System.out.println(listaTitulos[2]+" "+listaBlackLagoon[8]+" --> Qt.  "+contBlack9);}
		    	 if(contKill1!=0) {
		    		 System.out.println(listaTitulos[3]+" "+listaKilllaKill[0]+" --> Qt.  "+contKill1);}	
		    	 if(contKill2!=0) {
		    		 System.out.println(listaTitulos[3]+" "+listaKilllaKill[1]+" --> Qt.  "+contKill2);}	
		    	 if(contKill3!=0) {
		    		 System.out.println(listaTitulos[3]+" "+listaKilllaKill[2]+" --> Qt.  "+contKill3);}	
		    	 if(contRed1!=0) {
		    		 System.out.println(listaTitulos[4]+" "+listaRedGarden[0]+" --> Qt.  "+contRed1);}
		    	 if(contRed2!=0) {
		    		 System.out.println(listaTitulos[4]+" "+listaRedGarden[1]+" --> Qt.  "+contRed2);}
		    	 if(contRed3!=0) {
		    		 System.out.println(listaTitulos[4]+" "+listaRedGarden[2]+" --> Qt.  "+contRed3);}
		    	 if(contRed4!=0) {
		    		 System.out.println(listaTitulos[4]+" "+listaRedGarden[3]+" --> Qt.  "+contRed4);}
		    	 
		    	
		    	somaValor = (contAfro1*precoAfro)+(contAfro2*precoAfro)+(contAkira1*precoAkira)+
			   			 (contAkira2*precoAkira)+(contAkira3*precoAkira)+(contAkira4*precoAkira)+
			   			 (contAkira5*precoAkira)+(contAkira6*precoAkira)+(contBlack1*precoBlack)+
			   			 (contBlack2*precoBlack)+(contBlack3*precoBlack)+(contBlack4*precoBlack)+
			   			 (contBlack5*precoBlack)+(contBlack6*precoBlack)+(contBlack7*precoBlack)+
			   			 (contBlack8*precoBlack)+(contBlack9*precoBlack)+(contKill1*precoKill)+
			   			 (contKill2*precoKill)+(contKill3*precoKill)+(contRed1*precoRed)+(contRed2*precoRed)+
			   			 (contRed3*precoRed)+(contRed4*precoRed);
		   
		    	System.out.println("\n O valor total da sua compra é de: R$"+somaValor);
		    	
		    	System.out.println("\n Caso deseje finalizar sua compra, digite (1) \n Caso queira retornar ao menu de títulos, digite (2)");
		    	System.out.println("\n Para remover itens do carrinho, digite (3)");
		    	int a = leia.nextInt();
		    	
		    		switch(a) {
		    		case 1: finalizaCompra(); break;
		    		case 2: menuTitulos(); break;
		    		case 3: limpaCarrinho();break;
		    		}
		    }
		    
		    public void limpaCarrinho() {
		    int a;		 
				
		    	 if(contAfro1!=0) {
		    	 	System.out.println("\n Deseja excluir "+listaTitulos[0]+" "+listaAfroSamurai[0]+" do carrinho?");
		    	 	System.out.println("\n Sim --> (1) \t Não --> (2)");
		    	 	 a = leia.nextInt();
		    	 	 if(a==1) {
		    	 		 contAfro1--;
		    	 		System.out.println(listaTitulos[0]+" "+listaAfroSamurai[0]+" foi removido do carrinho"); 
		    	 	    Carrinho();
		    	 	 }if(a==2) { 
		    	 		 
		    	 		 	if(contAfro2!=0) {
				    	 	System.out.println("\n Deseja excluir "+listaTitulos[0]+" "+listaAfroSamurai[1]+" do carrinho?");
				    	 	System.out.println("\n Sim --> (1) \t Não --> (2)");
				    	 	 a = leia.nextInt();
				    	 	 if(a==1) {
				    	 		 contAfro2--;
				    	 		System.out.println(listaTitulos[0]+" "+listaAfroSamurai[1]+" foi removido do carrinho"); 
				    	 		Carrinho();
				    	 	 }if(a==2) {
				    	 		 
				    	 		 if(contAkira1!=0) {						     
				   			      System.out.println("\n Deseja excluir"+listaTitulos[1]+" "+listaAkira[0]+" do carrinho?");
				   			      System.out.println("\n Sim --> (1) \t Não --> (2)");
				   			      a = leia.nextInt();
				   			      if(a==1) {
				   			    	contAkira1--;
				   			    System.out.println(listaTitulos[1]+" "+listaAkira[0]+" foi removido do carrinho"); 
				   			    Carrinho();
				   			      }if(a==2) { 
				   			    	 
				   			    if(contAkira2!=0) {							 
				   				 System.out.println("\n Deseja excluir"+listaTitulos[1]+" "+listaAkira[1]+" do carrinho?");
				   				 System.out.println("\n Sim --> (1) \t Não --> (2)");
				   				 a = leia.nextInt();
				   				 if(a==1) {
				   				 contAkira2--;
				   				 System.out.println(listaTitulos[1]+" "+listaAkira[1]+" foi removido do carrinho"); 
				   				 Carrinho();
				   				 }if(a==2) {
				   					    	 		 
				   				if(contAkira3!=0) {					       
				   				System.out.println("\n Deseja excluir"+listaTitulos[1]+" "+listaAkira[2]+" do carrinho?");
				   				System.out.println("\n Sim --> (1) \t Não --> (2)");
				   				a = leia.nextInt();
				   				if(a==1) {
				   				 contAkira3--;
				   				System.out.println(listaTitulos[1]+" "+listaAkira[2]+" foi removido do carrinho"); 
				   				Carrinho();
				   				}if(a==2) {
				   				
				   			    if(contAkira4!=0) {						    
				   			    System.out.println("\n Deseja excluir"+listaTitulos[1]+" "+listaAkira[3]+" do carrinho?");
				   			    System.out.println("\n Sim --> (1) \t Não --> (2)");
				   				a = leia.nextInt();
				   				if(a==1) {
				   				 contAkira4--;
				   				System.out.println(listaTitulos[1]+" "+listaAkira[3]+" foi removido do carrinho"); 	
				   				Carrinho();
				   				}if(a==2) {
				   					
				   			    if(contAkira5!=0) {							
				   				System.out.println("\n Deseja excluir"+listaTitulos[1]+" "+listaAkira[4]+" do carrinho?");
				   				System.out.println("\n Sim --> (1) \t Não --> (2)");
				   			    a = leia.nextInt();
				   			    if(a==1) {
				   				contAkira5--;
				   				System.out.println(listaTitulos[1]+" "+listaAkira[4]+" foi removido do carrinho"); 	
				   				Carrinho();
				   			    }if(a==2) {
				   								
				   				if(contAkira6!=0) {							
				   				System.out.println("\n Deseja excluir"+listaTitulos[1]+" "+listaAkira[5]+" do carrinho?");
				   				System.out.println("\n Sim --> (1) \t Não --> (2)");
				   				a = leia.nextInt();
				   				if(a==1) {
				   			     contAkira6--;
				   				System.out.println(listaTitulos[1]+" "+listaAkira[5]+" foi removido do carrinho"); 
				   				Carrinho();
				   				}if(a==2) { 	
	            
	            if(contBlack1!=0) {				           
		            System.out.println("\n Deseja excluir"+listaTitulos[2]+" "+listaBlackLagoon[0]+" do carrinho?");
					System.out.println("\n Sim --> (1) \t Não --> (2)");
					a = leia.nextInt();
					if(a==1) {
					contBlack1--;
					System.out.println(listaTitulos[2]+" "+listaBlackLagoon[0]+" foi removido do carrinho"); 
					Carrinho();
					}if(a==2) {
						
			        if(contBlack2!=0) {				            
		            System.out.println("\n Deseja excluir"+listaTitulos[2]+" "+listaBlackLagoon[1]+" do carrinho?");
					System.out.println("\n Sim --> (1) \t Não --> (2)");
					a = leia.nextInt();
					if(a==1) {
					contBlack2--;
					System.out.println(listaTitulos[2]+" "+listaBlackLagoon[1]+" foi removido do carrinho"); 
					Carrinho();
					}if(a==2) {
						
			        if(contBlack3!=0) {				           
		            System.out.println("\n Deseja excluir"+listaTitulos[2]+" "+listaBlackLagoon[2]+" do carrinho?");
					System.out.println("\n Sim --> (1) \t Não --> (2)");
					a = leia.nextInt();
					if(a==1) {
					contBlack3--;
					System.out.println(listaTitulos[2]+" "+listaBlackLagoon[2]+" foi removido do carrinho"); 
					Carrinho();
					}if(a==2) {
						
				    if(contBlack4!=0) {				           
		            System.out.println("\n Deseja excluir"+listaTitulos[2]+" "+listaBlackLagoon[3]+" do carrinho?");
					System.out.println("\n Sim --> (1) \t Não --> (2)");
					a = leia.nextInt();
					if(a==1) {
					contBlack4--;
					System.out.println(listaTitulos[2]+" "+listaBlackLagoon[3]+" foi removido do carrinho"); 
					Carrinho();
					}if(a==2) {
						
		            if(contBlack5!=0) {					        
			        System.out.println("\n Deseja excluir"+listaTitulos[2]+" "+listaBlackLagoon[4]+" do carrinho?");
					System.out.println("\n Sim --> (1) \t Não --> (2)");
					a = leia.nextInt();
					if(a==1) {
					contBlack5--;
					System.out.println(listaTitulos[2]+" "+listaBlackLagoon[4]+" foi removido do carrinho"); 
					Carrinho();
					}if(a==2) {
						
				    if(contBlack6!=0) {				            
		            System.out.println("\n Deseja excluir"+listaTitulos[2]+" "+listaBlackLagoon[5]+" do carrinho?");
					System.out.println("\n Sim --> (1) \t Não --> (2)");
					a = leia.nextInt();
					if(a==1) {
					contBlack6--;
					System.out.println(listaTitulos[2]+" "+listaBlackLagoon[5]+" foi removido do carrinho"); 
					Carrinho();
					}if(a==2) {
						
			        if(contBlack7!=0) {					       
			        System.out.println("\n Deseja excluir"+listaTitulos[2]+" "+listaBlackLagoon[6]+" do carrinho?");
					System.out.println("\n Sim --> (1) \t Não --> (2)");
					a = leia.nextInt();
					if(a==1) {
					contBlack7--;
					System.out.println(listaTitulos[2]+" "+listaBlackLagoon[6]+" foi removido do carrinho"); 
					Carrinho();
					}if(a==2) {
						
			        if(contBlack8!=0) {			
			        System.out.println("\n Deseja excluir"+listaTitulos[2]+" "+listaBlackLagoon[7]+" do carrinho?");
					System.out.println("\n Sim --> (1) \t Não --> (2)");
					a = leia.nextInt();
					if(a==1) {
					contBlack8--;
					System.out.println(listaTitulos[2]+" "+listaBlackLagoon[7]+" foi removido do carrinho"); 
					Carrinho();
					}if(a==2) {
						
			        if(contBlack9!=0) {					        
			        System.out.println("\n Deseja excluir"+listaTitulos[2]+" "+listaBlackLagoon[8]+" do carrinho?");
					System.out.println("\n Sim --> (1) \t Não --> (2)");
					a = leia.nextInt();
					if(a==1) {
					contBlack9--;
					System.out.println(listaTitulos[2]+" "+listaBlackLagoon[8]+" foi removido do carrinho"); 
					Carrinho();
					}if(a==2) {
	           
	        	   	   if(contKill1!=0) {					        
				        System.out.println("\n Deseja excluir"+listaTitulos[3]+" "+listaKilllaKill[0]+" do carrinho?");
						System.out.println("\n Sim --> (1) \t Não --> (2)");
						a = leia.nextInt();
						if(a==1) {
						contKill1--;
						System.out.println(listaTitulos[3]+" "+listaKilllaKill[0]+" foi removido do carrinho"); 
						Carrinho();
						}if(a==2) {
							
					    if(contKill2!=0) {
					    System.out.println("\n Deseja excluir"+listaTitulos[3]+" "+listaKilllaKill[1]+" do carrinho?");
						System.out.println("\n Sim --> (1) \t Não --> (2)");
						a = leia.nextInt();
						if(a==1) {
						contKill2--;
						System.out.println(listaTitulos[3]+" "+listaKilllaKill[1]+" foi removido do carrinho"); 
						Carrinho();
						}if(a==2) {
							
					    if(contKill3!=0) {					        
					    System.out.println("\n Deseja excluir"+listaTitulos[3]+" "+listaKilllaKill[2]+" do carrinho?");
						System.out.println("\n Sim --> (1) \t Não --> (2)");
						a = leia.nextInt();
						if(a==1) {
						contKill3--;
						System.out.println(listaTitulos[3]+" "+listaKilllaKill[2]+" foi removido do carrinho"); 
						Carrinho();
						}if(a==2) {
	            	
	                if(contRed1!=0) {					       
					    System.out.println("\n Deseja excluir"+listaTitulos[4]+" "+listaRedGarden[0]+" do carrinho?");
						System.out.println("\n Sim --> (1) \t Não --> (2)");
						a = leia.nextInt();
						if(a==1) {
						contRed1--;
						System.out.println(listaTitulos[4]+" "+listaRedGarden[0]+" foi removido do carrinho"); 
						Carrinho();
						}if(a==2) {
							
					    if(contRed2!=0) {					      
					    System.out.println("\n Deseja excluir"+listaTitulos[4]+" "+listaRedGarden[1]+" do carrinho?");
						System.out.println("\n Sim --> (1) \t Não --> (2)");
						a = leia.nextInt();
						if(a==1) {
						contRed2--;
						System.out.println(listaTitulos[4]+" "+listaRedGarden[1]+" foi removido do carrinho"); 
						Carrinho();
						}if(a==2) {
							
					    if(contRed3!=0) {					       
					    System.out.println("\n Deseja excluir"+listaTitulos[4]+" "+listaRedGarden[2]+" do carrinho?");
						System.out.println("\n Sim --> (1) \t Não --> (2)");
						a = leia.nextInt();
						if(a==1) {
						contRed3--;
						System.out.println(listaTitulos[4]+" "+listaRedGarden[2]+" foi removido do carrinho"); 
						Carrinho();
						}if(a==2) {
							
					    if(contRed4!=0) {					      
				        System.out.println("\n Deseja excluir"+listaTitulos[4]+" "+listaRedGarden[3]+" do carrinho?");
						System.out.println("\n Sim --> (1) \t Não --> (2)");
						a = leia.nextInt();
						if(a==1) {
						contRed4--;
						System.out.println(listaTitulos[4]+" "+listaRedGarden[3]+" foi removido do carrinho"); 
						Carrinho();
						}if(a==2) {
							Carrinho();}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}
	            	
	            }	    

			public String getAdm() {
				return adm;
			}

			public void setAdm(String adm) {
				this.adm = adm;
			}

			public String getSenhaAdm() {
				return senhaAdm;
			}

			public void setSenhaAdm(String senhaAdm) {
				this.senhaAdm = senhaAdm;
			}

			public String getCliente() {
				return cliente;
			}

			public void setCliente(String cliente) {
				this.cliente = cliente;
			}

			public String getSenhaCliente() {
				return senhaCliente;
			}

			public void setSenhaCliente(String senhaCliente) {
				this.senhaCliente = senhaCliente;
			}	    

		}
