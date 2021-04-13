package ExercicoTecnasdeProgramação1;

public class Questão01 {
	public static void main(String[]args) {
		 
		float salario = 1895.58f;
		
		if(salario <= 1909.93f) {
			System.out.println("Você está isento do IR");
		}else if(salario >=  2826.66f) {
		System.out.println("Você se enquadra na faixa de 7,5% do IR");
		}else if(salario >= 3751.05f) {
			System.out.println("Você se enquadra na faixa de 15,0%");
		}else if(salario >= 4664.68f) {
			System.out.println("Você se enquadra na faixa de 22,5%");
		}else if(salario > 4664.68f) {
			System.out.println("você se enquadra na faixa de 27,5%");
		}else {
			System.out.println("Você está isento do IR");
		}
			
	}
	}
		
			
 		
		
		
	


