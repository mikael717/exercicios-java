package arrays;

public class Foreach {

	public static void main(String[] args) {
		
		double[] notas = {9.9, 8.8, 7.7, 9.3};
		
		for (int i = 0; i < notas.length; i++ ) {
			System.out.print(notas[i] + " ");
		}
		System.out.println();
		for ( double nota : notas) {
			System.out.print(nota + " ");
		}
	}
}
