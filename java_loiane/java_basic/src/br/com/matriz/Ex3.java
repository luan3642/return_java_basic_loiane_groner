package br.com.matriz;
import java.util.Scanner;
public class Ex3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int par = 0;
		int impar = 0;
		for(int i = 0; i <matriz.length; i++) {
			for(int j = 0; j<matriz[i].length; j++) {
				System.out.println("digite os valores da linha"+i);
				matriz[i][j] = scan.nextInt();
				if(matriz[i][j] % 2 == 0) {
					par++;
				} else {
					impar++;
				}
				
			}
			System.out.println();
		}
		
		System.out.println("quantidade de pares: "+par);
		System.out.println("quantidade de impares: "+impar);
	}

}
