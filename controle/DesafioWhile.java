package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int nota =0;
		int quantidadeDeNota = 0;
		double soma = 0;
		double media = 0;
		
		while(nota != -1) {
			System.out.print("digite a nota: ");
			nota = entrada.nextInt();
			
			if(nota <0 || nota>10) {
				System.out.println("digite um valor valido");
			}
			else if (nota != -1) {
				quantidadeDeNota++;
				soma+=nota; //pega o valor da variável soma e faz o somatório com o valor da variável nota.
			}		
		}
		media = soma/quantidadeDeNota;
		
		System.out.printf("SOMA: %.1f, Quantidade de Alunos: %d, MEDIA: %.1f", soma, quantidadeDeNota, media);
		
		entrada.close();
	}
}
