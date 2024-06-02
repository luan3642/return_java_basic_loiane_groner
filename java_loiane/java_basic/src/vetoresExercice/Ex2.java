package vetoresExercice;

public class Ex2 {
	public static void main(String[] args) {
		int[] vetorA = {1,2,3,4,5,6,7,8};
		
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i <vetorB.length; i++) {
			vetorB[i] = vetorA[i] *2;
		}
		
		for(int s : vetorB) {
			System.out.println(s);
		}
	}

}
