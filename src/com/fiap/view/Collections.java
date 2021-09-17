package com.fiap.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
		// precisa fazer um cast
		valor3 = (int) compras.get(2);
		System.out.println(valor3);

		// Interface list e uso de Generics
		// Generics não permite tipos primitivos
		//list permite itens repetidos

		List<String> carrinho = new ArrayList<String>();

		System.out.println("Seu carrinho está vazio? " + carrinho.isEmpty());

		carrinho.add("Brinco");
		carrinho.add("Colar");
		carrinho.add("pulseira");
		// altera conteudo dentro do array list
		carrinho.set(1, "Anel");
		carrinho.add("Colar");

		System.out.println("Seu carrinho ainda continua vazio? " + carrinho.isEmpty());
		System.out.println("Quantidade de itens: " + carrinho.size());

		System.out.println("Tem Brinco na lista? " + carrinho.contains("Brinco"));
		System.out.println("Qual a posição de pulseira? " + carrinho.indexOf("pulseira"));
		System.out.println(carrinho.get(carrinho.indexOf("Anel")));
		System.out.println("Ultima posição de colar: " + carrinho.lastIndexOf("Colar"));

		
		System.out.println("");
		System.out.println("========================================");
		
		// Hashset - não permite itens duplicados
		Set<String> cesta = new HashSet<String>();

		System.out.println("A cesta está vazia? " + cesta.isEmpty());
		cesta.add("alface");
		cesta.add("tomate");
		cesta.add("pepino");
		cesta.add("alface");
		System.out.println("A cesta continua vazia? " + cesta.isEmpty());
		System.out.println("Quantos itens tem na cesta? " +cesta.size());
		System.out.println(cesta);
		
		
		System.out.println("");
		System.out.println("========================================");
		
		//Map
		Map<String, String> funcionario = new HashMap<String, String>();
		funcionario.put("M123", "Amanda");
		funcionario.put("M124", "Aline");
		funcionario.put("M125", "Adriana");
		
		System.out.println("Quantos funcionários tem? " +funcionario.size());
		System.out.println("Tem um funcionário M124? " +funcionario.containsKey("M124"));
		System.out.println("Tem um funcionário chamado Ana? " +funcionario.containsValue("Ana"));
		System.out.println(funcionario);

	}
}
