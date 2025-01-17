package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		System.out.println(maisDois // andThen faz ap�s a a��o anterior
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0));
		
		int resultado = aoQuadrado // compose faz o contrario do
				.compose(vezesDois) // andThen
				.compose(maisDois) // faz antes da a��o anterior
				.apply(0);
		
		System.out.println(resultado);
	}
}
