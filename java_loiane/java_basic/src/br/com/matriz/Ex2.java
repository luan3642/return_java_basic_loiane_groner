package br.com.matriz;
import java.util.Random;


public class Ex2 {
	public static void main(String[] args) {
		int[][] matrizM = new int[10][10];
		Random rd = new Random();
		
		int intervaloMinimo = 10;
		int intervaloMaximo = 30;
		
		int max_value5 = Integer.MIN_VALUE;
		int min_value5 = Integer.MAX_VALUE;
		
		int max_value7 = Integer.MIN_VALUE;
		int min_value7 = Integer.MAX_VALUE;
		
		for(int i = 0; i<matrizM.length; i++) {
			for(int j = 0; j<matrizM[i].length; j++) {
				matrizM[i][j] = rd.nextInt((intervaloMaximo - intervaloMinimo)+1)+intervaloMinimo;
				if(matrizM[5][j] > max_value5) {
					max_value5 = matrizM[i][j];
				}
				if(matrizM[5][j] < min_value5) {
					min_value5 = matrizM[i][j];
				}
				
				if(matrizM[7][j] > max_value7) {
					max_value7 = matrizM[i][j];
				}
				if(matrizM[7][j] < min_value7) {
					min_value7 = matrizM[i][j];
				}
				
			}
		}
		
		for(int[] linha : matrizM) {
			for(int coluna : linha) {
				System.out.print(coluna + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("maior valor da linha 5: "+max_value5);
		System.out.println("menor valor da linha 5: "+min_value5);
		
		System.out.println();
		
		System.out.println("maior valor da linha 7: "+max_value7);
		System.out.println("menor valor da linha 7: "+min_value7);
	}
}
