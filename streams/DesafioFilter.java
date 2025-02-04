package streams;

import java.util.Arrays;
import java.util.List;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("iPod", 2323.22, 0.1,11);
		Produto p2 = new Produto("iPhone", 8531.99, 0.22,12);
		Produto p3 = new Produto("iPad", 6441.83, 0.18,14);
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3);
		
		produtos.stream()
			.filter(p -> p.desconto >= 0.15)
			.filter(p -> p.precoComDesconto() >= 100)
			.map(p -> "super Descontos no " + p.nome + " !!").forEach(System.out::println);;
	}
}
