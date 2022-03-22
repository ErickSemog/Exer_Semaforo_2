package view;

import java.util.Random;

import controller.CozinheiroJava;

public class Cozinha {
	public static final String NOMES[] = { "Gregori", "Pedro", "Hector", "Iverson", "Vinicius", "Kyrie", "Lebron",
			"Kobe", "Jordan", "Harden" };

	public static void main(String[] args) {

		
		int qtd_cozinheiros = (int) ((Math.random() * 10) + 1);
		int qtd_pratos = (int) ((Math.random() * 10) + 5);

		CozinheiroJava[] cozinheiros = new CozinheiroJava[qtd_cozinheiros];
		
		String buffer = "";

		for (int i = 0; i < qtd_cozinheiros; i++) {
			String nome = nomeAleatorio();
			cozinheiros[i] = new CozinheiroJava(nome);
			buffer += nome + " | ";
		}
		
		
		System.out.println("Cozinheiros: " + buffer);

		
		for (int i = 0; i < qtd_pratos; i++)
			for(CozinheiroJava cozinheiro : cozinheiros)
				cozinheiro.novoPrato();

	}


	
	public static String nomeAleatorio() {
		int random = new Random().nextInt(NOMES.length);
		return NOMES[random];
	}
}