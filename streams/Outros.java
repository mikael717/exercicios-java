package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Bia", 8.1);
		Aluno a4 = new Aluno("Lia", 9.0);
		Aluno a5 = new Aluno("Lia", 9.0);
		Aluno a6 = new Aluno("Lia", 9.0);
		Aluno a7 = new Aluno("Lia", 9.0);
		Aluno a8 = new Aluno("Lia", 9.0);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

		System.out.println("Distinct..."); // tirou os duplicado por conto do hashcode and equals na classe ALUNO
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");
		alunos.stream().distinct().skip(2).limit(2).forEach(System.out::println);
		
		System.out.println("\ntakeWhile");
		alunos.stream().distinct().skip(2).takeWhile(a -> a.nota >= 7).forEach(System.out::println);
	}
}
