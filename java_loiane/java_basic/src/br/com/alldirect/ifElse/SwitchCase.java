package br.com.alldirect.ifElse;

public class SwitchCase {

	public static void main(String[] args) {
		diaSemana(1);
	}
	
	private static void diaSemana(int dia) {
		switch (dia) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("dia util");
			break;
		case 6:
		case 7:
			System.out.println("final de semana");
			break;
		default:
			throw new IllegalArgumentException("entrada fora dos valores: "+dia);
		}
	}

}
