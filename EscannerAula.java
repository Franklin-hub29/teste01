package AulaScanner;

import java.util.Scanner; 

public class EscannerAula {
	
	public static void main(String[]args) {
		
		Scanner leitura = new Scanner(System.in);
		
		
		System.out.println("Digite o nome da sua faculdade:");
		String universidade = leitura.nextLine();
		
		System.out.println("Digite seu nome");
		String nome = leitura.nextLine();
		
		System.out.println(" Qual a sua idade");
		int idade = leitura.nextInt();
		
		System.out.println("Qual a cidad você mora");
		String cidade =leitura.nextLine();
		
		
		System.out.println("Bem vido " + nome +" a Faculdade " + universidade+ "e com sua idade " +idade );
		
		// leitura.close() -> fecha a leitura referente a variavel 
		// pesquidar no google  java string format
		
	}
}
