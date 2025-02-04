package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class DesafioFilterResposta {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Livro", 54.99, 0.1, 12);
		Produto p2 = new Produto("Impressora", 2064.99, 0.3, 0);
		Produto p3 = new Produto("Cadeira", 1032.99, 0.35, 55);
		Produto p4 = new Produto("Monitor", 2780.99, 0.32, 0);
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4);
											//lambda expression
		Predicate<Produto> superPromocao = p -> p.desconto >= 0.25;
		Predicate<Produto> freteGratis = p -> p.valorFrete == 0;
		Predicate<Produto> precoRelevante = p -> p.preco >= 1000;
		//Function<Produto,Double> valorReal = p -> p.preco * (1 - p.desconto);
		
		Function<Produto, String> chamadaPromocional = p -> "Aproveite! " + p.nome + " por R$" + p.preco;
		
		produtos.stream().filter(superPromocao).filter(freteGratis).filter(precoRelevante)
		.map(chamadaPromocional).forEach(System.out::println);;
	}
}
