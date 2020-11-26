import java.util.*;

public class Lanchonete {
	
	public static void main(String[] args) {
		
		Collection<String> lanches = new ArrayList();
		
		// armazena dados
		
		lanches.add("Coxinha");
		lanches.add("Esfiha");
		lanches.add("Kibe");
		lanches.add("Pastel");
		lanches.add("HotDog");
		
		if(lanches.isEmpty()) {
		
			System.out.println("Oops...n�o temos lanches no card�pio ainda... :(");
		}else {
			
		System.out.println("Card�pio: "+ lanches);
		
		}
		
		// Atualiza dados
		
		Collection<String> lanches2 = Arrays.asList("P�o de batata","P�o de queijo");
		
		lanches.addAll(lanches2);
		
		System.out.println("Card�pio: "+lanches);
		
		
		// Apresenta dados da list
		
		for(String cardapio: lanches) {
			
			System.out.println("Lanche: "+cardapio);
		}
		
		// remove dados/ clear
		
		lanches.remove("Kibe");
				
		System.out.println("Card�pio: "+lanches);
				
		lanches.clear();
				
		System.out.println("Card�pio: "+lanches);
		
	}
	
	

}
