package br.com.matriz;

public class MediaAlunos {
	public static void main(String[] args) {
		double[][] notasAlunos = new double[3][4];
		
		notasAlunos[0][0] = 4.5;
		notasAlunos[0][1] = 7.4;
		notasAlunos[0][2] = 4.5;
		notasAlunos[0][3] = 7.4;
		
		notasAlunos[1][0] = 8.5;
		notasAlunos[1][1] = 6.4;
		notasAlunos[1][2] = 9.5;
		notasAlunos[1][3] = 8.4;
		
		notasAlunos[2][0] = 2.5;
		notasAlunos[2][1] = 6.4;
		notasAlunos[2][2] = 9.5;
		notasAlunos[2][3] = 8.4;
		
		double media = 0;
		
		for(int i = 0; i<notasAlunos.length; i++) {
			media =0;
			for(int j = 0; j<notasAlunos[i].length; j++) {
				media += notasAlunos[i][j];
			}
			System.out.println("media do Aluno: "+i + " = " +(media/4));
		}
	}
}
