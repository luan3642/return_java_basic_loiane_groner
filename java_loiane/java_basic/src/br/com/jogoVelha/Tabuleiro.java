package br.com.jogoVelha;

import java.util.Scanner;
public class Tabuleiro {
	private String[][] posicoesTabuleiro;
	private boolean campoValido = false;
	Scanner scan = new Scanner(System.in);
	
	public Tabuleiro() {
		posicoesTabuleiro = new String[3][3];
	}
	
	public boolean checarValidadeCampo(int linha, int coluna) {
		if(linha >=0 && linha <=3 && coluna >=0 && coluna <=3 && posicoesTabuleiro[linha][coluna] == null) {
			return true;
		}
		return false;
		
	}
	
	public void checarPosicaoAtualTabuleiro() {
		for(int i = 0; i<posicoesTabuleiro.length; i++) {
			for(int j = 0; j<posicoesTabuleiro[i].length; j++) {
				System.out.print(posicoesTabuleiro[i][j] + "|");
			}
			System.out.println();
		}
	}
	
	public void realizarJogada() {
		System.out.println("escolha uma posicao para realizar sua jogada da posicao");
		System.out.println("voce devera escolher linha e coluna");
		int linha = 0;
		int coluna = 0;
		boolean jogadaValida = false;
		
		do{
			System.out.println("a linha vai de 0 a 2");
			linha = scan.nextInt();
			System.out.println("a coluna vai de 0 a 2");
			coluna = scan.nextInt();
			
			if(checarValidadeCampo(linha, coluna)) {
				jogadaValida = true;
			} else {
				System.err.println("jogada invalida, pois voce ja preencheu este campo");
			}
			
			System.out.println("escolha X ou O");
			posicoesTabuleiro[linha][coluna] = scan.next();
		}while(!jogadaValida);
	}
	
	
}
