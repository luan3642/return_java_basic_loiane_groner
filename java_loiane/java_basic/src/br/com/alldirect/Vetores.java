package br.com.alldirect;

public class Vetores {
	public static void main(String[]args) {
		
		double[] temperaturas = new double[365];
		
		temperaturas[0] = 23.3;
		temperaturas[1] = 45.3;
		temperaturas[2] = 32.3;
		
		System.out.println("o valor da temperatura do dia 1 é: "+temperaturas[0]);
		
		System.out.println("tamanho do array: "+temperaturas.length);
		
		System.out.println("valores do array"+temperaturas);
		
		
		System.out.println("percorrendo o array");
		for(int h = 0; h<temperaturas.length; h++) {
			if(temperaturas[h] != 0.0) {
				System.out.println(temperaturas[h]);
			}
		}
		
		System.out.println("usanado forEach");
		for(double s : temperaturas) {
			if(s != 0.0) {
				System.out.println(s);

			}
		}
		
		
	}

}
