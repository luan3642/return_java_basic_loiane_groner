package br.com.alldirect;
import java.util.Scanner;

public class Fatorial {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean parar = false;
		boolean primo = true;

		System.out.println("Digite um valor");
		int valor = scan.nextInt();
		
		while (parar != true && valor <16 ) {
			
			double raiz = Math.sqrt(valor);
			if(valor <2) {
				primo = false;
			} else if(valor == 2 ) {
				primo = true;
			} else if (valor % 2 == 0) {
				primo = false;
			}else {
				for(int i = 3; i <=raiz; i+=3) {
					if(valor % raiz == 0) {
						primo = false;
					}
				}
			}
			
			
			System.out.println(primo ? "o valor: "+valor + " é primo " : "o valor nao é primo");

			System.out.println("deseja parar? ");
			parar = scan.nextBoolean();
			
		}
		
		System.out.println(valor >16 ? "o numero foi excedido" : " voce escolheu sair");
		
		
	}
}
