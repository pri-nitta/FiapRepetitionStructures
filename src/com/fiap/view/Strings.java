package com.fiap.view;

import java.util.Arrays;

public class Strings {

	public static void main(String[] args) {
		String nome;
		nome = new String();
		nome = "Maça";
		System.out.println(nome);
		
		String nome2 = new String("Pera");
		System.out.println(nome2);
		
		//pool de memória que funciona como um cash
		String nome3 = "Uva";
		System.out.println(nome3);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		//caracteres scape
		String descricao = "Maça Gala \nA mais doce do mercado";
		System.out.println(descricao);
		
		String espaco = "Suco de pera \té o melhor";
		System.out.println(espaco);
		
		String aspas = "Uva verde: \"sem semente\" é a mais fácil de comer";
		System.out.println(aspas);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		//Concatenar
		String primeiro = new String("Faça elevar");
		String segundo = new String("o cosmo no seu coração");
		
		String mais = primeiro + " " + segundo;
		System.out.println(mais);
		
		String concatenar = primeiro.concat(" ").concat(segundo);
		System.out.println(concatenar);
		
		mais += "!";
		System.out.println(mais);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		//comparando strings
		String n1 = new String ("sono");
		String n2 = new String("Sono");
		String n3 = new String("sono");
		
		System.out.println(n1.equals(n2)); //false pq tem uma letra maiuscula
		System.out.println(n1.equalsIgnoreCase(n2)); // true pq ignora as letras maiusculas
		System.out.println(n1.equals(n3)); //true
		
		boolean teste = (n1 == n3);
		System.out.println(teste); // false, pq alocação de memória é diferente
		
	
		String n4 = "cansada";
		String n5 = "cansada";
		
		teste = (n4 == n5);
		System.out.println(teste); // true, pq como não foram instanciadas, estão armazenadas em um pool de memória
		
		String musica = new String("O mundo acaba hoje e eu estarei dançando");
		
		System.out.println("A quantidade de caracteres da frase é " + musica.length());
		System.out.println("Começa com O? " + musica.startsWith("O"));
		System.out.println("Termina com dança? " +musica.endsWith("dança"));
		System.out.println("Caractere na posição 3: " +musica.charAt(3));
		System.out.println("Index da letra \"a\": " + musica.indexOf("a"));
		System.out.println("Index da palavra \"hoje\": " +musica.indexOf("hoje"));
		System.out.println("Index do último \"o\": " +musica.lastIndexOf("o")); 
		
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		String acima = new String("Mas quando sempre é sempre nunca");
		
		System.out.println(acima.replace("M", "m"));
		System.out.println(acima.replace("quando", "qndo"));
		
		System.out.println(acima.split(" ").length);
		System.out.println(Arrays.toString(acima.split(" ")));
		
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		String diasMelhores = new String("Vivemos esperando o dia em que Seremos Melhores"); 
		
		System.out.println(diasMelhores.toUpperCase());
		System.out.println(diasMelhores.toLowerCase());
		
		System.out.println(diasMelhores.substring(0,4));
		System.out.println(diasMelhores.substring(31)); //trecho que começa a partir do caractere 31
		System.out.println(diasMelhores.substring(diasMelhores.indexOf("esperando"), diasMelhores.indexOf("dia")));
		
	}

}
