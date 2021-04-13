package questao01casa;

import java.util.Scanner;

public class quetao01casa {
	
	
	
	public static void main(String[]args) {
		
		Scanner valor = new Scanner(System.in);
		
				
		
		
		float salario = valor.nextFloat();
		System.out.println("Informe seu salario");
		
		if(salario >= 2826.66f) {
			System.out.println("Você se enquadra na faixa de 7,5% do IR");
		}else if(salario >= 3751.05f) {
			System.out.println("Você se enquadra na faixa de 15,0% do IR");
		}else if(salario >= 4664.68f) {
			System.out.println("Você se enquadra na faixa de 22,5% doIR");
		}else if(salario > 4664.68f) {
			System.out.println("Você se enquadra na faixa de 27,5% do IR");
		}else {
			System.out.println("Você está isento do IR");
			
			
		
			
			
		}
				
	}

}
