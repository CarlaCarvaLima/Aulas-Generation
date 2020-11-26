
public class TesteAutomovel {
	
	public static void main(String args[])
	{
		//instanciando um objeto da classe Automovel
		Automovel auto1 = new Automovel("Erick Neves","Monza","EAD4040",1997);
		//troca de mensagens (chamada ao método imprimirInfo())
		auto1.imprimirInfo();
		System.out.println("** Transferência de Proprietário**");
		auto1.setNomeProprietario("Felipe Caetano");
		auto1.imprimirInfo();
		
		Automovel auto2 = new Automovel("Israel Simplicio","Golf","ISF1010",2002);
		auto2.setPlaca("SDK2581");
		auto2.imprimirInfo();
		
	}
}



