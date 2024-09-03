package app;

public class Program {
	public static void main(String[] args) {
		
		String test1 = "passaram";
		String test2 = "amor";
		String test3 = "perfume";
		String test4 = "copo";
		
		System.out.println(verificarString(test1));
		System.out.println(verificarString(test2));
		System.out.println(verificarString(test3));
		System.out.println(verificarString(test4));
		
		
	}
	
	public static String verificarString(String str) {
		int quantidadeDeVezes = 0;
		
		for(int i = 0; i <= str.length() - 1; i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'A') {
				quantidadeDeVezes++;
			}
		}
		
		if(quantidadeDeVezes == 0) {
			return "Não existe a letra 'A' na string";
		}
		
		return "Existe a letra 'A' na string, e as vezes que ela aparece é " + quantidadeDeVezes;
	}
}
