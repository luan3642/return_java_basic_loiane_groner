package br.com.exercice.forWhile;

import java.util.Scanner;

public class Primos {
	 public static void main(String[] args) {

	        Scanner scan = new Scanner(System.in);
	        System.out.println("digite um numero" );
	        int n = scan.nextInt();

	        double raiz = Math.sqrt(n);
	        boolean primoIsTrue = true;

	        if(n <=1 ) {
	            primoIsTrue = false;
	        } else if (n == 2){
	            primoIsTrue = true;
	        } else if (n % 2 == 0){
	            primoIsTrue = false;
	        } else{
	            for(int i = 3; i <= raiz; i+=2){
	                if(n % i == 0){
	                    primoIsTrue = false;
	                    break;
	                }

	            }
	        }




	        System.out.println(primoIsTrue ? "Primo" : "Não é primo");
	    }
}
