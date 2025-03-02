package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4453.22); //usando o contrutor novo;
		
		var p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 11.25;
		
		//acessando o desconto diretamente a partir da classe;
		Produto.desconto = 0.5; //p2.desconto //acessando diretamente a classe e não somente a instância 
	
		double precoFinal1 = p1.precoComDesconto(); //substituindo a equação que se repete, pode um método criado na classe produto;
		double precoFinal2= p2.precoComDesconto();//notação ponto
		
		
		System.out.printf("Produto 1: %s = %.2f \n", p1.nome, p1.preco);
		System.out.printf("Produto 2: %s = %.2f \n",p2.nome, p2.preco);
		System.out.printf("Produto 1 com desconto: %s = %.2f \n",p1.nome, precoFinal1);
		System.out.printf("Produto 2 com desconto: %s = %.2f \n",p2.nome, precoFinal2);

	}
}
