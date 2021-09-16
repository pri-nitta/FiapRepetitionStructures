package com.fiap.view;

public class Caixa {

	public static void main(String[] args) {
		
		int qtdProdutos = 5;
		int registro = 0;
		
//		// faz a checagem antes
//		while (registro < qtdProdutos) {
//			registro++;
//			System.out.println("O produto número " + registro + " foi registrado.");
//		}
//		
//		//executa antes e dpois verifica
//		do {
//			registro++;
//			System.out.println("O Caixa registrou o produto " +registro);
//		} while (registro < qtdProdutos);
		
		//faz a mesma coisa, sem a variável registro
		for (int i = 1; i <= qtdProdutos; i++) {
			System.out.println("O caixa registrou o produto " +i);
		}

	}

}
