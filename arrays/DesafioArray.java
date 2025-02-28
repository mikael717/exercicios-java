package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.print("numero de notas inseridas: ");
		int qntNotas = entrada.nextInt();
		
		double[] notas = new double [qntNotas];
		
		//System.out.println(notas[3]);
		
		for (int i=0; i < notas.length; i++) { // i = linhas
			System.out.print("digite o valor da " + (i + 1)+ "a nota: ");
			notas [i] = entrada.nextDouble();
		}
		
		System.out.println(Arrays.toString(notas));
		
		double soma = 0;
		
		for (double nota : notas) {
			soma += nota;
		}
		
		double media = soma /qntNotas;
		System.out.printf("A media eh %.2f", media );
		
	entrada.close();
	}
}
