package vetoresExercice;

import java.util.Random;

public class Ex4 {
	public static void main(String[] args) {
		
		Random rd = new Random();
		int[] vetorA = new int[15];
		
		int[] vetorB = new int[vetorA.length];
		
		System.out.println("elementos de A");
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = rd.nextInt(100);
			System.out.println(vetorA[i]);
		}
		
		System.out.println();
		System.out.println("raiz quadrada destes elementos");
		for(int i = 0; i<vetorB.length; i++) {
			vetorB[i] = (int)Math.sqrt(vetorA[i]);
			System.out.println(vetorB[i]);
		}
		
		
	}
}
