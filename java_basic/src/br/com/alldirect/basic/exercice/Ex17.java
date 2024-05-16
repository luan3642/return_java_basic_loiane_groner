package br.com.alldirect.basic.exercice;

public class Ex17 {

	public static void main(String[] args) {
		int n = fatorial(5);
		
		System.out.println(n);
		

	}
	
	public static int fatorial(int n) {
		if(n < 2 && n>= 0) {
			return 1;
		}
		
		return n * fatorial(n-1);
		
		
	}

}
