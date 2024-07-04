package excessoesPersonalizadas;

public class MinhaExcecaoPersonalizada extends Exception{
	public MinhaExcecaoPersonalizada() {
		super();
	}
	
	public MinhaExcecaoPersonalizada(String mensagem) {
		super(mensagem);
	}
	
	public MinhaExcecaoPersonalizada(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
	
	public MinhaExcecaoPersonalizada(Throwable causa) {
		super(causa);
	}

}
