package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Carla", 8.6);
		Aluno a2 = new Aluno("Ju", 7.5);
		Aluno a3 = new Aluno("Vicente", 3.1);
		Aluno a4 = new Aluno("Jo", 5.5);
		Aluno a5 = new Aluno("Bia", 6.9);
		Aluno a6 = new Aluno("Irene", 7.1);
		
		//criando uma lista com os objetos
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);
									
									//lambda expression
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, String> saudacao = a -> "Aprovado! " + a.nome + " Parabens";
		
		alunos.stream().filter(aprovado).map(saudacao).forEach(System.out::println);
			
		
		/*===========OU============
		alunos.stream()
		.filter(a -> a.nota >= 7)
		.map(a-> "aprovado! " + a.nome + " parabens ")
		.forEach(System.out::println);*/
		
	}
}
