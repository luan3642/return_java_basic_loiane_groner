package br.com.matriz.irregular;

import java.util.Scanner;

public class PessoasEntrevistadas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o número de pessoas entrevistadas:");
        int numeroPessoasEntrevistadas = scan.nextInt();
        
        String[][] nomesFilhos = new String[numeroPessoasEntrevistadas][];
        
        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.println("Entre com a quantidade de filhos da pessoa " + (i + 1) + ":");
            int quantidadeFilhos = scan.nextInt();
            
            nomesFilhos[i] = new String[quantidadeFilhos];
            
            for (int j = 0; j < quantidadeFilhos; j++) {
                System.out.println("Digite o nome do filho " + (j + 1) + ":");
                nomesFilhos[i][j] = scan.next();
            }
        }
        
        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.println("Pessoa " + (i + 1) + " tem " + nomesFilhos[i].length + " filhos:");
            for (int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.println("Nome do filho " + (j + 1) + ": " + nomesFilhos[i][j]);
            }
        }
        
        scan.close();
    }
}
