package generics;

public class CaixaTeste {

	public static void main(String[] args) {
		
		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("Segredo!");
		
		String coisaA = caixaA.abrir(); // sem cast, mais simples
		System.out.println(coisaA);
		
		Caixa<Double> caixaB = new Caixa<>();
		caixaB.guardar(3.1415);
		
		Double coisaB = caixaB.abrir(); // sem cast, mais simples
		System.out.println(coisaB);
	}
}
