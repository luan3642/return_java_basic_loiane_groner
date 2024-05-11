package br.com.alldirect.forWhile;
import java.util.*;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int par = 0;
		int impar = 0;
		for(int i = 1; i<=10; i++) {
			System.out.println("digite: "+i+ " numeros");
			int numeros = scan.nextInt();
			
			if(numeros % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		
		System.out.println("pares"+par);
		System.out.println("impar"+impar);

		

	}

}
