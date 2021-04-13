package ExercicoTecnasdeProgramação1;

import java.util.Scanner;

public class QuestaoSeis06 {
	
	 static Scanner valor = new Scanner(System.in);
	
	public static void main(String[]args) {
		
		float gas = 5.55f  , etanol = 5.99f;
		
	float	resultado = valor.nextFloat();
		
		  resultado =  etanol/gas *100;
		
		if(resultado >= 70) {
			System.out.println("Vale apena abastecer com gasolina");
		}else {
			System.out.println("Vale apena abastecer com etnol");
		}
		
		
	}
	

}
