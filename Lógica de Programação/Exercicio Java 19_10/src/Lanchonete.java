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
		
			System.out.println("Oops...não temos lanches no cardápio ainda... :(");
		}else {
			
		System.out.println("Cardápio: "+ lanches);
		
		}
		
		// Atualiza dados
		
		Collection<String> lanches2 = Arrays.asList("Pão de batata","Pão de queijo");
		
		lanches.addAll(lanches2);
		
		System.out.println("Cardápio: "+lanches);
		
		
		// Apresenta dados da list
		
		for(String cardapio: lanches) {
			
			System.out.println("Lanche: "+cardapio);
		}
		
		// remove dados/ clear
		
		lanches.remove("Kibe");
				
		System.out.println("Cardápio: "+lanches);
				
		lanches.clear();
				
		System.out.println("Cardápio: "+lanches);
		
	}
	
	

}
