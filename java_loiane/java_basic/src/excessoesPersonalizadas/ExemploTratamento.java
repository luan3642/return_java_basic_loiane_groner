package excessoesPersonalizadas;

public class ExemploTratamento {

	public static void main(String[] args) {
		ExemploUso exemploUso = new ExemploUso();
		
		
		try {
			exemploUso.lancaExcessao();
		}catch(MinhaExcecaoPersonalizada e ) {
			System.out.println("tratando a excessao" + e.getMessage());
		}

	}

}
