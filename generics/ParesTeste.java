package generics;

public class ParesTeste {

	public static void main(String[] args) {
		
		Pares<Integer, String> resultadoConsurso = new Pares<>();
		
		resultadoConsurso.adicionar(1, "Maria");
		resultadoConsurso.adicionar(2, "Josi");
		resultadoConsurso.adicionar(3, "Bia");
		resultadoConsurso.adicionar(2, "Carla");
		
		System.out.println(resultadoConsurso.getValor(1));
		System.out.println(resultadoConsurso.getValor(3));
		System.out.println(resultadoConsurso.getValor(2));
	}
}
