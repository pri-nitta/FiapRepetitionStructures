package com.fiap.view;

public class Array {

	public static void main(String[] args) {
		
		//tamb�m pode ser declarado com os colchetes ap�s o nome da vari�vel
		//quando um array � instanciado, tdas as posi��es j� s�o inicializadas com 0
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

	}

}
