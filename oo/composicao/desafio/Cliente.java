package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	//um cliente tem muitas compras
	final String nome;
	final List<Compra> compras = new ArrayList<>();
	//criando um construtor
	Cliente(String nome){
		this.nome = nome;
	}
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	double obterValorTotal() {
		double total =0;
		
		for(Compra compra: compras) {
			total += compra.obterValorTotal();
		}
		
		return total;
	}
}
