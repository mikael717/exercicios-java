package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double [4];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.7;
		notasAlunoA[1] = 8.7;
		notasAlunoA[2] = 9.7;
		notasAlunoA[3] = 9.8;
		
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println("primeira nota = " + notasAlunoA[0]);
		System.out.println("ultima nota = " + notasAlunoA[notasAlunoA.length - 1]);
		
		
		double totalAlunoA = 0;
		
		for(int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA [i];
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		double notaArmazenada = 5.9;
		double[] notasAlunoB = {8.8,5.8,notaArmazenada,9.9};
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
	}
}
