package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "sarah sarada";
		compra1.itens.add(new Item("caneta", 10, 7.77));
		compra1.itens.add(new Item("borracha", 12, 4.14));
		compra1.itens.add(new Item("caderno", 3, 14.14));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
	}
}
