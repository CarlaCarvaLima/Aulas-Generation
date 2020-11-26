import java.util.*;

public class Cliente extends Usuario {
	public String login;
	public int senha;

	int a = 0;

	Scanner ler = new Scanner(System.in);

	public void escolheLoginouCatalogo() {

		a = leia.nextInt();
		switch (a) {
		case 0:
			do {
				logar();
			} while (validarLogin(login) == false || validarSenha(senha) == false);

			menuTitulos();
			break;

		case 1:
			System.out.println(
					"Essa � o nosso cat�logo. Escolha o t�tulo desejado para verificar os volumes dispon�veis.");
			menuTitulos();
			break;
		}

	}

	public void logar() {

		System.out.println("Insira seu login: ");

		login = ler.nextLine();
		System.out.println("Insira sua senha: ");
		senha = ler.nextInt();
		validarLogin(login);
		validarSenha(senha);

	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		login = login;
	}

	public int getSenha() {
		return senha;
	}

	public int setSenha(int senha) {
		return senha;
	}

	public boolean validarLogin(String login) {

		String cadastroCliente = "cliente";
		if (cadastroCliente.equals(login)) {
			return true;
		}

		else {
			System.out.println("Usu�rio ou senha incorretos");

			return false;
		}
	}

	public boolean validarSenha(int senha) {
		int cadSenha = 321;
		if (senha != cadSenha) {
			System.out.println("Usu�rio ou senha incorretos");
			ler.nextLine();
			return false;
		}

		else {
			return true;

		}

	}

	@Override
	public void finalizaCompra() {

		if (a == 1) {
			do {
				logar();
			} while (validarLogin(login) == false || validarSenha(senha) == false);
		a=2;	
		Carrinho();
		} else {

			System.out.println("\n Voc� comprou " + somaContadores + " mang�s e o valor total � R$" + somaValor);
			System.out.println(
					"\n Como deseja realizar o pagamento?\n Cart�o de cr�dito em 1 vez sem juros --> Digite (1) "
							+ "\n Cart�o de cr�dito em 2 vezes com juros de 10% --> Digite (2) \n Cart�o de cr�dito em 3 vezes com juros de 15% --> Digite (3) "
							+ "\n Boleto Banc�rio com desconto de 10% --> Digite (4)");
			int a = leia.nextInt();
			switch (a) {
			case 1:
				credito1();
				break;
			case 2:
				credito2();
				break;
			case 3:
				credito3();
				break;
			case 4:
				boleto();
				break;
			default:
				System.out.println("Oops...em finaliza compra...");

			}

			System.out.printf("\n Deseja efetuar o pagamento?");
			System.out.printf("\n Sim --> (1) \t N�o --> (2)");
			int b = leia.nextInt();
			switch (b) {
			case 1:
				System.out.println("\n Uhuuuu! Compra efetuada!");
				break;
			case 2:
				finalizaCompra();
				break;
			default:
				System.out.println("Oops...em finaliza compra...");
				break;
			}
			System.out.println(
					"\n Sua compra foi finalzada!\n  Deseja voltar a tela Inicial?\n Sim --> (1) \t\t N�o --> (2)");
			int c = leia.nextInt();
			switch (c) {
			case 1:
				telaInicial();
				break;
			case 2:
				System.out.println("\n Ok! Agradecemos pela sua compra! Volte em breve!");
				break;
			default:
				System.out.println("Oops...em finaliza compra...");
				break;
			}
		}
	}
}
