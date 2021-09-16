package com.fiap.view;

public class Array {

	public static void main(String[] args) {
		
		//também pode ser declarado com os colchetes após o nome da variável
		//quando um array é instanciado, tdas as posições já são inicializadas com 0
		float[] valores = new float[5];
		
		valores[0] = 10;
		valores[1] = 20;
		valores[2] = 30;
		valores[3] = 40;
		valores[4] = 50;
		
		System.out.println(valores[1]);
		
		int valor[] = {1,2,3,4,5};
		System.out.println(valor[2]);
		
		int valor2[] = new int[] {2,4,6,8,10};
		System.out.println(valor2[0]);
		
		Produto[] produtos = new Produto[2];
		
		Produto prod1 = new Produto();
		prod1.setNome("Chocolate");
		prod1.setDescricao("Meio Amargo");
		prod1.setValor(7);
		
		Produto prod2 = new Produto();
		prod2.setNome("Chocolate");
		prod2.setDescricao("Ao leite");
		prod2.setValor(8);
		
		produtos[0] = prod1;
		produtos[1] = prod2;
		
		for (int i=0; i < produtos.length; i++) {
			System.out.println(produtos[i].toString());
		}
		
		for (Produto prod: produtos) {
			System.out.println(prod.toString());
		}
		
		
		//Array multidimensional
		//10 corredores com 3 prateleiras cada
		Produto[][] localizacaoProduto = new Produto[10][3];
		
		localizacaoProduto[2][1] = prod1;
		localizacaoProduto[2][2] = prod2;
		
		System.out.println(localizacaoProduto[2][1].getNome() + " " + localizacaoProduto[2][1].getDescricao());
	}

}
