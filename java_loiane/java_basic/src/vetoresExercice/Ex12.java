package vetoresExercice;

import java.util.Random;

public class Ex12 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] vetorA = new int[10];
		int soma = 0;
		
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = rd.nextInt(10);
			soma += vetorA[i];
		}
		
		System.out.println("elementos de A");
		for(int i : vetorA) {
			System.out.println(i);
		}
		
		System.out.println("A soma é: "+soma);
		
	}
}
