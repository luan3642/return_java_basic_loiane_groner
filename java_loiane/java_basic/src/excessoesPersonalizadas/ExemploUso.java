package excessoesPersonalizadas;

public class ExemploUso {
	
	public static void lancaExcessao() throws MinhaExcecaoPersonalizada{
		
		// condicao de erro ficticia
		boolean erro = true;
		
		if(erro) {
			throw new MinhaExcecaoPersonalizada("deu erro");
		}
	}
	
	public static void main(String[] args) throws MinhaExcecaoPersonalizada {
		lancaExcessao();
	}

}
