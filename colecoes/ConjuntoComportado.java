package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		//Set<String> listaAprovados = new HashSet<>();
		SortedSet<String> listaAprovados = new TreeSet<>(); //usando está classe para trazer os dados na ordem;
		listaAprovados.add("ana");
		listaAprovados.add("iara");
		listaAprovados.add("luka");
		listaAprovados.add("pedro");
		
		for(String candidatos:listaAprovados) {
			System.out.println(candidatos);
		}
		
		Set<Integer> nums = new HashSet<>(); //trazendo os valores de modo aleatório.
		nums.add(1);
		nums.add(3);
		nums.add(5);
		nums.add(4);
		
		for (int num: nums) {
			System.out.println(num);
		}
	}
}
