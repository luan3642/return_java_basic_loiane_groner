package br.com.matriz;

public class Matriz {
	public static void main(String[] args) {
		//iniciar matriz java
		
		int[][] matriz = new int[3][3];
		
		int[][] iniciandoValores = {
				{1,2,3},
				{2,3,6},
				{7,8,9}
		};
		
		//vamos acessar um indice desta matriz, passando linha e coluna
		
		System.out.println("acessando valor: [8]>>>>"+iniciandoValores[2][1]);
		
		
		// percorrendo matriz
		
//		for(int i = 0; i<iniciandoValores.length; i++) {
//			for(int j = 0; j<iniciandoValores[i].length; j++) {
//				System.out.print(iniciandoValores[i][j]+ " ");
//			}
//			System.out.println();
//		}
		
		//somar duas matrizes
		
		int[][] matriz1 = {
				{1,2,3},
				{4,5,6}
				
		};
		
		int[][] matriz2 = {
				{2,5,6},
				{5,7,9}
		};
		
		int soma[][] = new int[2][3];
		double[][] multiplicaoMatriz = new double[2][3];
		
		System.out.println("soma:");
		for(int i = 0; i<matriz1.length; i++) {
			for(int j = 0; j<matriz2[i].length; j++) {
				soma[i][j] += matriz1[i][j] + matriz2[i][j]; 
				System.out.println(soma[i][j]);
			}
		}
		System.out.println();
		System.out.println("multiplicao:");
		for(int i = 0; i<matriz1.length; i++) {
			for(int j = 0; j<matriz2[i].length; j++) {
				multiplicaoMatriz[i][j] = matriz1[i][j] * matriz2[i][j];
				System.out.println(multiplicaoMatriz[i][j]);
			}
		}
	}
}
