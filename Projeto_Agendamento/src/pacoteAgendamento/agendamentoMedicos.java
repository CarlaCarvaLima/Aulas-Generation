package pacoteAgendamento;

import java.util.Scanner;

/*O sistema solicitar� o nome e a idade do paciente, com base nisso, indicar� se � Pediatra ou Cl�nico Geral
O sistema exibir� os hor�rios do m�dico selecionado, o usu�rio deve selecionar algum dos hor�rios dispon�veis
Deve-se imprimir o nome do usu�rio, o nome do m�dico especialista e o hor�rio agendado.
*/


public class agendamentoMedicos {
	public static void main(String[] args) {
		
Scanner ler = new Scanner (System.in);
		
		String nome;
		int idade, hora, data; 
		int[] horariosP = {9,10,14,15};
		int[] horariosC = {11,12,16,17};
		int[] datas = {14,15,16,17};	
		String[] medicosP = {"Dr. Gonzales", "Dra. Simone", "Dra. T�mara"};
		String[] medicosC = {"Dra. Regina", "Dr. Pl�nio", "Dr. Valter"};
		int medico;

		
		System.out.println("Ol�! Primeiramente, nos diga seu nome: ");
		nome = ler.next();
		
		
		System.out.println("Agora, nos diga sua idade: ");
		idade = ler.nextInt();
		
		
		
		//		PEDIATRA
		
		
		if (idade <= 18 && idade >= 0)
		{		
			
			for (int i=0; i<medicosP.length; i++) // SELECAO DE MEDICOS P.
			{
				System.out.println("Medicos dispon�veis: " + medicosP[i] + " -  Selecione: " + i + " para agendar");
			}
			
			medico = ler.nextInt();
			
			for (int d=0; d<datas.length; d++) //SELECAO DE DATA P.
			{
				System.out.println(datas[d] + "/10 - Selecione: (" + d + ") para agendar");
			}
			
			data = ler.nextInt();
			
			
			// MENORES DE 18 ANOS
			
			for (int i=0; i< horariosP.length ; i++) //SELECAO DE HORARIO P.
			{
				System.out.println("Hor�rios dispon�veis: " + horariosP[i] + ":00 - Selecione: " + i + " para agendar");
				
				
			}
			hora = ler.nextInt();
			
			System.out.printf("Obrigado " + nome + ", sua consulta foi agendada para o dia " + datas[data] + "/10, �s " + horariosP[hora] + ":00 com " + medicosP[medico]);
		}
		
		
		//      CLINICO GERAL 
		
		else if (idade > 18 && idade <=120)
		{
			
			for (int i=0; i < medicosC.length; i++) //SELECAO DE MEDICOS C.
			{
				System.out.println("Medicos dispon�veis: " + medicosC[i] + " - Selecione: " + i + " para agendar.");
			}
			
			medico = ler.nextInt();
			
			for (int d=0; d<datas.length; d++) //SELECAO DE DATA C.
			{
				System.out.println(datas[d] + "/10 - Selecione: (" + d + ") para agendar");
			}
			
			data = ler.nextInt();
			
			//MAIORES DE 18 ANOS
			
			for (int i=0; i< horariosC.length; i++) //SELECAO DE DATA C.
			{
				System.out.println("Horarios dispon�veis: " + horariosC[i] + ":00 - Selecione: " + i + " para agendar.");				
			}
			
			hora = ler.nextInt();
			
			 
			System.out.printf("Obrigado " + nome + ", sua consulta foi agendada para o dia " + datas[data] + "/10, �s " + horariosC[hora] + ":00 com " + medicosC[medico]);
				
		}
		
		else 
		{
			System.out.println("Idade inv�lida. ");
		}
	}
}