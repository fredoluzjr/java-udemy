package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = // Function recebe um argumento de entrada e retorna uma String
				numero -> numero % 2 == 0 ? "Par" : "�mpar";
		
		Function<String, String> oResultadoE = 
				valor -> "O resultado �: " + valor;
				
		Function<String, String> empolgado = 
				valor -> valor + "!!!";
				
		String resultadoFinal = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(32);
		
		System.out.println(resultadoFinal);
		System.out.println(parOuImpar.apply(32));
	}
}
