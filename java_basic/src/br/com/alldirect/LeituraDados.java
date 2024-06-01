package br.com.alldirect;
import java.util.Scanner;
public class LeituraDados {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

		/*
		
		System.out.println("digite sue primeiro nome");
		String nome = scan.next();
		
		System.out.println("seu primeiro nome "+nome);
		
		
		System.out.println("digite sua altura");
		float altura = scan.nextFloat();
		
		System.out.println("sua altura é " +altura);
		*/
		
		System.out.println("digite seu sexo: ");
		String sexo = scan.nextLine();
		
		System.out.println("seu sexo é "+sexo);
		
		
		System.out.println("digite seu nome, seu sexo, sua idade");
		String fistName = scan.next();
		String sex = scan.next();
		int year = scan.nextInt();
		
		System.out.println("primeiro nome "+ fistName);
		System.out.println("voce digitou o sexo"+ sex);
		System.out.println("voce digitou a sua idade"+ year);
		

	}

}
