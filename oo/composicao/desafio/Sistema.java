package oo.composicao.desafio;

public class Sistema {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra(); //criando uma nova compra -> instânciando um objeto da classe compra;
		compra1.adicionarItem("Caneta", 9.77, 100); //usando o construtor com assinatura 3; o qual já cria um novo produto através do método;
		compra1.adicionarItem(new Produto ("Notebook",2882.44), 2); //usando o outro construtor o qual é necessário criar o produto 
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 10.0,10);
		compra2.adicionarItem(new Produto("Impressora", 1228.88), 1);
		
		
		Cliente cliente = new Cliente("maria");
		cliente.adicionarCompra(compra1); //usando o método construido na classe cliente;
		cliente.compras.add(compra2); //adicionando a compra2 diretamente à lista, não é a uma boa prática
		
		System.out.println(cliente.obterValorTotal());
	}
}
