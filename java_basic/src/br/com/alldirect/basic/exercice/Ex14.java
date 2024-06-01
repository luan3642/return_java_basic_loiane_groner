package br.com.alldirect.basic.exercice;

public class Ex14 {

	public static void main(String[] args) {
		calcula(59);
	}
	
	private static void calcula (int pesoPeixe) {
		
		final int peso_limite = 50;
		
		if(pesoPeixe > peso_limite) {
			double calculaMulta = (pesoPeixe - peso_limite) * 4.00;
			System.out.println("Multa no valor de: "+calculaMulta);
			
		}else {
			System.out.println("Nao a multa, o peso do peixe nao excedeu "+pesoPeixe);
		}
	}

}
