package ExercicoTecnasdePrograma��o1;

public class Quest�o01 {
	public static void main(String[]args) {
		 
		float salario = 1895.58f;
		
		if(salario <= 1909.93f) {
			System.out.println("Voc� est� isento do IR");
		}else if(salario >=  2826.66f) {
		System.out.println("Voc� se enquadra na faixa de 7,5% do IR");
		}else if(salario >= 3751.05f) {
			System.out.println("Voc� se enquadra na faixa de 15,0%");
		}else if(salario >= 4664.68f) {
			System.out.println("Voc� se enquadra na faixa de 22,5%");
		}else if(salario > 4664.68f) {
			System.out.println("voc� se enquadra na faixa de 27,5%");
		}else {
			System.out.println("Voc� est� isento do IR");
		}
			
	}
	}
		
			
 		
		
		
	


