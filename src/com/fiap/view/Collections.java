package com.fiap.view;

import java.util.ArrayList;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		
		ArrayList compras = new ArrayList();
		Double valor = 200.55;
		int quantidade = 1;
		int valor3;
		
		compras.add(valor);
		compras.add("Vestido");
		compras.add(quantidade);
		
		System.out.println(compras.get(1));
		//precisa fazer um cast
		valor3 = (int) compras.get(2);
		System.out.println(valor3);
		
		
		//Interface list e uso de Generics
		//Generics não permite tipos primitivos
		
	List<String> carrinho = new ArrayList<String>();
	
	System.out.println("Seu carrinho está vazio? " + carrinho.isEmpty());
	
	carrinho.add("Brinco");
	carrinho.add("Colar");
	carrinho.add("pulseira");
	//altera conteudo dentro do array list
	carrinho.set(1, "Anel");
	
	System.out.println("Seu carrinho ainda continua vazio? "+carrinho.isEmpty());
	System.out.println("Quantidade de itens: "+carrinho.size());
	
	}
}
