package br.com.generation.excollections;

import java.util.ArrayList;

public class ExEstoque {

	public static void main(String[] args) {
				
		String estoque1 = "Maça";
		String estoque2 = "Kiwi";
		String estoque3 = "Banana";
		String estoque4 = "Manga";
		String estoque5 = "Damasco";
				
		ArrayList<String> estoque = new ArrayList<>();
		estoque.add(estoque1);
		estoque.add(estoque2);
		estoque.add(estoque3);
		estoque.add(estoque4);
				
		System.out.println(estoque);
				
		estoque.add(estoque5);
		System.out.println(estoque);
				
		estoque.remove(2);
		System.out.println(estoque);
				
		for(String i: estoque) {
			System.out.println("Frutas mais vendidas: " + i);
		}
	}
}


