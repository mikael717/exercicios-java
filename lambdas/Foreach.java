package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Mia");
		
		System.out.println("Forma tradicional...");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		//métodos para foreach funcional
		System.out.println("\nLambda #01...");
		aprovados.forEach(nome -> System.out.println(nome + "!")); //parâmetro do método foreach
		
		System.out.println("\nMethod Reference #01...");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLamba #02...");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\nMethod Reference #02");
		aprovados.forEach(Foreach::meuImprimir);
	}
	static void meuImprimir (String nome) {
		System.out.println("Oi! Meu nome eh " + nome);
	}
}
