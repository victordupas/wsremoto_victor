package tratarexcecao;

public class MinhaExcecao {

	public static String tratar(Exception e) {
	

		
		if (e instanceof NullPointerException) {
			return "nullo";
		} else if (e instanceof NumberFormatException) {
			return "formato";
			
		} else if (e instanceof NullPointerException) {
			return "nulo";
		} else if (e instanceof ArrayIndexOutOfBoundsException) {
			return "lista estourou";
			
		} else {
			e.printStackTrace();
			return "erro generico";
		}
		
	}
	
	
}
