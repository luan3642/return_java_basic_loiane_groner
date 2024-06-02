package vetoresExercice;

import java.util.Random;

public class Ex3 {
	public static void main(String[] args) {
		
		Random rd = new Random();
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		System.out.println("vetor A");
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = rd.nextInt(20);
			System.out.println(vetorA[i]);
		}
		
		System.out.println();
		System.out.println("VetorB ao quadrado de A");
		for(int i = 0; i<vetorB.length; i++) {
			vetorB[i] = (int) Math.pow(vetorA[i], 2);
			System.out.println(vetorB[i]);
		}
	}
}
