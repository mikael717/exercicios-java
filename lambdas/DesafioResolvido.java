package lambdas;


import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioResolvido {

	public static void main(String[] args) {
		
											//recebe um produto "p" pescando o valor na classe produto;
		Function<Produto, Double> resultado = produto -> produto.preco * (1 - produto.desconto);
		UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		UnaryOperator<Double> arredondar = preco -> (double) Math.ceil(preco);
		Function<Double, String> formatar = preco -> "R$" + preco;
		
		Produto p = new Produto ("iPad", 3235.89, 0.14);
	
		
		String preco = resultado.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(formatar).apply(p);
		System.out.println("O preco final eh " + preco);
	}
}
