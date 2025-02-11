package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario("Carla"));
		usuarios.add(new Usuario("bia"));
		usuarios.add(new Usuario("Leh"));
		
		boolean resultado = usuarios.contains(new Usuario ("bia"));
		System.out.println(resultado);
	}
}
