package questao01casa;

import java.util.Scanner;
public class questao03 {
	
	public static void main(String[]args) {
		
		Scanner valor = new Scanner(System.in);
		System.out.println("Informe a idade do nadador");
		
		int idade = valor.nextInt();
		
		if(idade <=7) {
			System.out.println("Voc� est� na categoria Infantil A ");
		}else if(idade <= 10) {
			System.out.println("Voc� est� na categoria Infatil B  ");
		}else if(idade <= 13) {
			System.out.println("Voc� est� na categoria Juvenil A ");
		}else if(idade <= 17 ) {
			System.out.println("Voc� est� na categoria Juvenil B ");
		}else if(idade <= 60) {
			System.out.println("Voc� est� na categoria Aduto");
		}else if(idade >=60) {
			System.out.println("Voc� est� Acima de 60");
			
			
			
			
		}
		
		
		
	}

}
