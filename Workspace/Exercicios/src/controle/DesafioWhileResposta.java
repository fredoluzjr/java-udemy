package controle;

import java.util.Scanner;

public class DesafioWhileResposta {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.println("Informe a nota (ou -1 p/ sair): ");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >= 0){
				total += nota;
				quantidadeDeNotas++;
			} else if(nota != -1) {
				System.out.println("Nota inv�lida!");
			}
		}
		
		double media = total / quantidadeDeNotas;
		System.out.println("M�dia = " + media);

		entrada.close();
	}
}
