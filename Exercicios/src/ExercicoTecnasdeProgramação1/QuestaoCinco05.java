

package ExercicoTecnasdeProgramação1;

import java.util.Scanner;

public class QuestaoCinco05 {
	
	public static void main(String[]args) {
		
		Scanner dado = new Scanner(System.in);
		System.out.println("  Informe o número de 01 a 7 referente ao dia da semana:  ");
		
		int DiaSemana = dado.nextInt();
		
		
		
		if(DiaSemana == 1 ) {
			System.out.println("Domingo");
		}else if(DiaSemana == 2) {
			System.out.println("Segunda feira");
		}else if(DiaSemana == 3) {
			System.out.println("Terça feira");
		}else if (DiaSemana == 4) {
			System.out.println("Quarta feira");
		}else if (DiaSemana == 5) {
			System.out.println("Quinta feira");
		}else if(DiaSemana == 6) {
			System.out.println("Sexta fira");
		}else if(DiaSemana == 7) {
			System.out.println("Sábado");
		}	
		
	}
}
		
		

		
		
	
	


