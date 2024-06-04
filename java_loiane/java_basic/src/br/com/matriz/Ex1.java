package br.com.matriz;

import java.util.Random;

public class Ex1 {
	public static void main(String[] args) {
		int[][] matrizA = new int[4][4];

		// 5 > -909
		// 5 > 2
		//
		Integer maxValue = Integer.MIN_VALUE;
		Random rd = new Random();
		int linha = 0, coluna = 0;

		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				matrizA[i][j] = rd.nextInt(9);
				if (matrizA[i][j] > maxValue) {
					maxValue = matrizA[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
		
		for(int[] line: matrizA) {
			for(int column : line) {
				System.out.print(column +" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("valor: "+maxValue);
		System.out.println();
		System.out.println("linha: "+linha);
		System.out.println("coluna: "+coluna);
		

	}
}
