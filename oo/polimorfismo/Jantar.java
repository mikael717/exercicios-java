package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.77); //passando no parâmetro, definido pelo construtor o peso da pessoa.
		
		Arroz ingrediente1 = new Arroz (0.22);
		Feijao ingrediente2 = new Feijao (0.23);
		
		System.out.println(convidado.getPeso());
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		System.out.println(convidado.getPeso());

		Sorvete ingrediente3 = new Sorvete (0.24);
		convidado.comer(ingrediente3);
		System.out.println(convidado.getPeso());
		
		
	}
}
