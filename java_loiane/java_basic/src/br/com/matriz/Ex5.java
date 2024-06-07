package br.com.matriz;

public class Ex5 {
	
	static String[][][] guardarCompromissos = new String[12][31][8];
	
	public static void agendarCompromissos(int mes, int dia, int horas, String compromisso) {
		guardarCompromissos[mes][dia][horas] = compromisso;
		
	}
	
	public static void listarCompromisso(int mes, int dia, int horas) {
		if(guardarCompromissos[mes][dia][horas] != null) {
			System.out.println("O compromisso que está agendado, mes "+ mes +" no dia: " + dia + " horas: " + horas + " é o: " + guardarCompromissos[mes][dia][horas]);

		}
	}
	
	public static void main(String[] args) {
		agendarCompromissos(5, 24, 4, "festa de niversario luan");
		listarCompromisso(5, 24, 4);
	}

}
