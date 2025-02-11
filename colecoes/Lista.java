package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana"); //instânciando o usuário, em seguida adcionando-o à lista
		lista.add(u1);
		
		lista.add(new Usuario("Carla")); //criando o usuário e já adicionando-o à lista;
		lista.add(new Usuario("lia"));
		lista.add(new Usuario("fran"));
		lista.add(new Usuario("luka"));
		
		System.out.println(lista.get(2)); // possibilidade de acessar pelo indice != do Set
		
		System.out.println(">>>>" + lista.remove(1));
		System.out.println(lista.remove(new Usuario("lia")));
		
		System.out.println("tem? "+ lista.contains(new Usuario("fran")));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}
