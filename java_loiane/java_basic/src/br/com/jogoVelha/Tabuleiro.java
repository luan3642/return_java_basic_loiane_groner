package br.com.jogoVelha;

import java.util.Iterator;

public class Tabuleiro {
	private String[][] posicoesTabuleiro;
	private boolean campoValido = false;
	public Tabuleiro() {
		posicoesTabuleiro[3][3] = "";
	}
	
	public void checarValidadeCampo() {
		
	}
	
	public void checarPosicaoAtualTabuleiro() {
		for(int i = 0; i<posicoesTabuleiro.length; i++) {
			for(int j = 0; j<posicoesTabuleiro[i].length; j++) {
				System.out.print(posicoesTabuleiro[i][j] + "|");
				if(posicoesTabuleiro[i][j] == null) {
					campoValido = true;
				}
			}
			System.out.println();
		}
	}
	
	
}
