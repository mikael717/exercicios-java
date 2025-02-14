package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno ("carla");
		Aluno aluno2 = new Aluno ("isa");
		Aluno aluno3 = new Aluno ("kanja");
		
		Curso curso1 = new Curso ("java completo");
		Curso curso2= new Curso ("web 2023");
		Curso curso3 = new Curso ("react native");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adionarCurso(curso3);
		aluno2.adionarCurso(curso3);
		aluno3.adionarCurso(curso3);

		for (Aluno aluno: curso3.alunos) {
			System.out.println("estou matriculado no curso " + curso3.nome + "...");
			System.out.println("... e o meu nome eh " + aluno.nome);
			System.out.println();
		}
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
		
		if(cursoEncontrado != null) {
			
			System.out.println(cursoEncontrado.alunos);
		}
	}
}
