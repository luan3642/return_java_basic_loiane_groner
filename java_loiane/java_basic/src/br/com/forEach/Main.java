package br.com.forEach;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		int[] notas = new int[10];
		
		Random rd = new Random();
		
		
		for(int i = 0; i<notas.length; i++) {
			notas[i] = rd.nextInt(10);
		}
		
		System.out.println("imprimindo usando o ForEach");
		
		for(int nota : notas) {
			System.out.println(nota);
		}
		
	}
}
