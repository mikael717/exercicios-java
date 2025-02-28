package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("quantidade de alunos: ");
		int qnteAlunos = entrada.nextInt();
		
		System.out.print("quantidade de notas: ");
		int qnteNotas = entrada.nextInt();
		
		double[][] notas = new double[qnteAlunos][qnteNotas]; //criando a matriz
		
		//variável soma para calculo da média.
		double soma = 0;
		//criar o laço 
		for (int i = 0; i< notas.length; i++) { // i = linhas; qtde de alunos
			for( int j = 0; j < notas[i].length; j++) {// j= colunas; qtde de notas
				System.out.printf("digite o valor da nota %d para o aluno %d: ", j+1, i+1);
				notas [i][j]= entrada.nextDouble();
				soma += notas[i][j];
			}
		}
		//media somatorio da matriz / produto de alunos e notas;
		double media = soma / (qnteAlunos * qnteNotas); //3 alunos e 3 notas => 9 notas ao todo => media = soma de todas as notas/ a quantidade de notas
		
		//laço for each
		//imprimindo de maneira formatada a matriz
		for (double[] notasTurma: notas) {
			System.out.println(Arrays.toString(notasTurma));
		}
		System.out.println("a media da turma eh = " + media);
		
		
	
		entrada.close();
	}
}


