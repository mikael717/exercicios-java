package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "carla");
		usuarios.put(11, "snow");
		usuarios.put(3, "swan");
		usuarios.put(4, "bianca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet()); // pega o valor da chave-> neste caso Integer
		System.out.println(usuarios.values());// pega o valor do objeto -> String
		System.out.println(usuarios.entrySet());//pega ambos os valores -> id && objeto; neste caso
		
		System.out.println(usuarios.containsKey(11));
		System.out.println(usuarios.containsValue("snow"));
		
		System.out.println(usuarios.get(4));
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(4, "vaca"));
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ===> ");
			System.out.println(registro.getValue());
		}
	}
}
