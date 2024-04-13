public class Argumentos{
	public static void main(String[]args){

		if(args.length !=0){
			System.out.println("voce digitou "+ args[0]);
		}else{
			System.err.println("voce nao digitou nada");
		}
	}
}