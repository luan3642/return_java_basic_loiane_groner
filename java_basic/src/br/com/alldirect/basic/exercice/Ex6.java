package br.com.alldirect.basic.exercice;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max_value = Integer.MIN_VALUE;
		int maior = 0;
		for(int n = 1; n<=5; ++n) {
			System.out.print("informe um numero");
			int numero = scan.nextInt();
			if(numero > max_value) {
				max_value = numero;
			}
		}
		System.out.println("maior valor: "+max_value);
	}

}
