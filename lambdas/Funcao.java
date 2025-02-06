package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		//interface funcional FUNCTION		//chamando a expressão lambda
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";
											//valor é a entrada na função
		Function<String, String> oResultadoE = valor -> "O resultado eh: " + valor;
		
		Function<String, String> empolgado = valor -> valor + "!";
		Function<String, String> duvida = valor -> valor + "?";
		
		String resultadoFinal1 = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(43);		
		System.out.println(resultadoFinal1);

		String resultadoFinal2 = parOuImpar.andThen(oResultadoE).andThen(duvida).apply(44);
		System.out.println(resultadoFinal2);
	}
}
