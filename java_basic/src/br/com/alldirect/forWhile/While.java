package br.com.alldirect.forWhile;

public class While {

	public static void main(String[] args) {
		
		int i = 1;
		final int max = 10;
		
		while(i < max) {
			System.out.println(i);
			++i;
		}
		
		do {
			i++;
			System.out.println("valor de i "+i);
		}while (i <=15);

	}

}
