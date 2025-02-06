package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		//Produto p = new Produto ("iPad", 3474.99, 0.14);
		
		BinaryOperator<Double> precoReal = (preco, desconto) -> (preco * (1 - desconto));
		UnaryOperator<Double> imposto = valor -> valor >= 2500 ? (valor * (1 + 0.085)) : 0;
		UnaryOperator<Double> frete = valorFrete-> valorFrete >= 3000 ? (valorFrete + 100) : (valorFrete + 50);
		UnaryOperator<Double> arredondar = valorRedondo -> (double) Math.ceil(valorRedondo);
		Function<Double, String> valorFinal = resultado -> "R$ " + resultado;
		
		System.out.println(precoReal.andThen(imposto).andThen(frete).andThen(arredondar).andThen(valorFinal).apply(3000.0, 0.1));

	}
}
