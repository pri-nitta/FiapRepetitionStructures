package com.fiap.view;

public class Strings {

	public static void main(String[] args) {
		String nome;
		nome = new String();
		nome = "Ma�a";
		System.out.println(nome);
		
		String nome2 = new String("Pera");
		System.out.println(nome2);
		
		//pool de mem�ria que funciona como um cash
		String nome3 = "Uva";
		System.out.println(nome3);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		//caracteres scape
		String descricao = "Ma�a Gala \nA mais doce do mercado";
		System.out.println(descricao);
		
		String espaco = "Suco de pera \t� o melhor";
		System.out.println(espaco);
		
		String aspas = "Uva verde: \"sem semente\" � a mais f�cil de comer";
		System.out.println(aspas);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		//Concatenar
		String primeiro = new String("Fa�a elevar");
		String segundo = new String("o cosmo no seu cora��o");
		
		String mais = primeiro + " " + segundo;
		System.out.println(mais);
		
		String concatenar = primeiro.concat(" ").concat(segundo);
		System.out.println(concatenar);
		
		mais += "!";
		System.out.println(mais);

	}

}
