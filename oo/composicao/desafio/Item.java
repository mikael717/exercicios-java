package oo.composicao.desafio;

public class Item {

	final Produto produto; //instânciando a classe produto nesta classe
	final int quantidade;
	
	//criando um construtor para a classe;
	Item(Produto produto, int quantidade){
		this.produto = produto;
		this.quantidade = quantidade;
	}
}
