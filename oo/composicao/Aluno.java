package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	final String nome;
	List<Curso> cursos = new ArrayList<>();
	
	Aluno(String nome){
		this.nome = nome;
	}
	
	void adionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	Curso obterCursoPorNome(String nome) {
		for (Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}
	
	public String toString() { //método usado sempre que há a necessidade de converter um objeto para formato String
		return nome;
	}
}
