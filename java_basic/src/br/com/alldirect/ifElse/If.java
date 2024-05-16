package br.com.alldirect.ifElse;

public class If {
	public static void main(String[] args) {
		System.out.println(lerIdade(14));
		System.out.println(Calcula(8));
	}
	
	private static String lerIdade(int idade) {
		
		if(idade >= 18) {
			return "maior de idade";
		}else {
			return "menor idade";
		}
	}
	
	private static String Calcula(int produto) {
		if(produto >= 17) {
			return "muito caro";
		} else if(produto < 17 && produto>=15 ) {
			return "pesquisar mais";
		} else if(produto <15 && produto >10) {
			return "pedir desconto";
		} else {
			return "barato";
		}
	}
}
