
public class Exercicio01 {
	
	public static void main(String[] args) {
		
		int[] vetorA = { 1,0,5,-2,-5,7 };
		int i;
		System.out.println("Vetor A: "+ vetorA[0] +" "+ vetorA[1] +" "+ vetorA[2] +" "+ vetorA[3] +" "+ vetorA[4] +" "+ vetorA[5]);
		System.out.println("A soma das posi��es [0], [1] e [5] �: " + (vetorA[0] + vetorA[1] + vetorA[5]));
		vetorA[4] = 100;
		System.out.println("O valor do vetor A na posi��o 4 agora �: "+vetorA[4]);
		System.out.println("Os valores do vetor A agora s�o: ");
		for (i=0;i<=5;i++){
		System.out.println("\t" + vetorA[i] +"------"+ " na posi��o " + i);
	}
		
	}	

}
