package Exercicios01e02;

public class TestaAnimais {
	
	public static void main(String[] args) {
		
		Cachorro Jubileu = new Cachorro ("cachorro","Jubileu",3,"correndo");
		Tigre Shere_Khan  = new Tigre ("tigre","Shere Khan",5,"correndo");
		Preguiça Sid = new Preguiça ("preguiça","Sid",4,"escalando árvores");
		
		Jubileu.imprimir();
		Jubileu.emitirSom();
		Jubileu.pulaLinha();
		Shere_Khan.imprimir();
		Shere_Khan.emitirSom();
		Jubileu.pulaLinha();
		Sid.imprimir();
		Sid.emitirSom();
		
	}

}
