package br.com.matriz;

import java.util.Scanner;

public class Ex4 {
	public static String[][] compromissos = new String [31][24];

	public void agendarCompromisso(int dia, int horario, String compromisso) {

		compromissos[dia][horario] = compromisso;
	}
	
	public void consultarCompromisso(int dia, int horas) {
		if(compromissos[dia][horas] != null) {
		System.out.println("O compromisso que está agendado no dia: " + dia + " horas: " + horas + " é o: " + compromissos[dia][horas]);
		} else {
			System.out.println("voce nao tem nada agendado para este dia ou horario");
		}
//		for(int i = 0; i<compromissos.length; i++) {
//			for(int j = 0; j<compromissos[i].length; j++) {
//				if(compromissos[i][j] )
//			}
//		}
	}
	
	public static void main(String[] args) {
		Ex4 ex4 = new Ex4();
		
		ex4.agendarCompromisso(2, 1, "cortar cabelo");
		ex4.consultarCompromisso(1,1);
		
	}
}
