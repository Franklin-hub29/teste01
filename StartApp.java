package br.edu.univas.main;
import java.util.Scanner;

import br.edu.univas.vo.Player;
import br.edu.univas.vo.Tipo;

import java.util.ArrayList;

public class StartApp {
	
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Player> players = new ArrayList<>();
		ArrayList<Tipo>tipos = new ArrayList<>();
		
		
		cadastrarPlayer(players,scanner);
		CadastrarTitulo(tipos,scanner);
		menuBusca(tipos,scanner);
		listarAlunosMestrado(tipos);

		
		
		scanner.close();
	}
	
	public static void cadastrarPlayer(ArrayList<Player>players,Scanner scanner) {


		Player player = new Player();
		System.out.println("Cadastrar Player\n");
		System.out.println("Informe o Player");
		player.setNome(readString(scanner));
		// scanner.nextLine();
		System.out.println("Informe o site");
		player.setSite(readString(scanner));
		// scanner.nextLine();



		players.add(player);



		}
	public static void CadastrarTitulo(ArrayList<Tipo>tipos,Scanner scanner) {
	    Tipo tipo = new Tipo();
	
	
	System.out.println("Informe o titulo");
	tipo.setTitulo(readString(scanner));
	System.out.println("Informe elenco");
	tipo.setElenco(readString(scanner));
	System.out.println("Descrição");
	tipo.setDescricao(readString(scanner));
	System.out.println("Informe o genero");
	tipo.setGenero(readString(scanner));
	System.out.println("Informe o diretor");
	tipo.setDiretor(readString(scanner));
	System.out.println("Informe a classificação etária");
	tipo.setClassificacaoEtaria(readString(scanner));
	
	

	tipos.add(tipo);


	}
	public static String readString(Scanner scanner) {
		String aux = scanner.nextLine();
		return aux;

		}

		public static int readInt(Scanner scanner) {
		int aux = scanner.nextInt();
		scanner.nextLine();
		return aux;
		}




public static void menuBusca(ArrayList<Tipo>tiposList,Scanner scanner) {
	System.out.println("Busca por titulo");
	Tipo titulo = new Tipo();
	 String tituloB = scanner.next();
	//String x = (scanner.nextLine());
	
	 
	/*for(int i = 0; i < tiposList.size(); i ++){
		//Tipo tituloP=tiposList.get(i);
	if(tiposList.contains(tituloB)) {
	System.out.println("Encontrado" + tituloB);
	}else{
		
	     System.out.println("Titulo não encontradado");
	}

	 
	 for(int i = 0; i < tiposList.size(); i ++){
			if(tiposList.get(i).equals(tituloB.())) {

			System.out.println("Encontrado" + tituloB);
			}else{
			System.out.println("Titulo não encontradado");
		*/	}
	 

	
	 
	 private static void listarAlunosMestrado(ArrayList<Tipo> tiposList) {
	        for (int i = 0; i < tiposList.size(); i++) {
	            Tipo x = tiposList.get(i);
	            System.out.println("teste"+x);
	            
	            
	 
	 
	
}
}
	 
}
