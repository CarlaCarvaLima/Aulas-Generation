package Exercicios01e02;

public class TestaAnimais {
	
	public static void main(String[] args) {
		
		Cachorro Jubileu = new Cachorro ("cachorro","Jubileu",3,"correndo");
		Tigre Shere_Khan  = new Tigre ("tigre","Shere Khan",5,"correndo");
		Pregui�a Sid = new Pregui�a ("pregui�a","Sid",4,"escalando �rvores");
		
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
