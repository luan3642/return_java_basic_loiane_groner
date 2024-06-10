package br.com.jogoVelha;

public enum Simbolo {
	X("X"),
	O("O");
	
	private final String emblema;
	
	private Simbolo(String simbolo) {
		this.emblema = simbolo;
	}
	
	private String getEmblema() {
		return emblema;
	}
	
	@Override
	public String toString() {
		return emblema;
	}

}
