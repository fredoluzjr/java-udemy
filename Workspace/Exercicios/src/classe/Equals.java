package classe;

// import java.util.Date;

public class Equals {
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@zemail.com.br";
			
		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@zemail.com.br";
			
		System.out.println(u1 == u2); // est� comparando os endere�os de mem�ria
		System.out.println(u1.equals(u2)); // tbm est� comparando os endere�os de mem�ria
		System.out.println(u2.equals(u1));

		// System.out.println(u2.equals(new Date())); 
	}
}
