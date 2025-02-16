package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("digite o nome do dia: ");
		String dia = sc.next(); //next = pegar apenas uma palavra; NextLine -> pegaria várias palavras
		
		
		if(dia.equalsIgnoreCase("domingo")) { //comparação entre string o ideal é não usar o "==" e sim usar uma função
			System.out.println("1");
		}
		else if("segunda".equalsIgnoreCase(dia)) { //tanto o literal no começo quanto a variavel no parametro vai funcionar.
			System.out.println("2");
		}
		else if(dia.equalsIgnoreCase("terca") || dia.equalsIgnoreCase("Terça")){
			System.out.println("3");
		}
		else if(dia.equalsIgnoreCase("quarta")) {
			System.out.println("3");
		}
		else if(dia.equalsIgnoreCase("quinta")) {
			System.out.println("5");
		}
		else if(dia.equalsIgnoreCase("sexta")) {
			System.out.println("6");
		}
		else if(dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("sábado")) {
			System.out.println("7");
		}
		else {
			System.out.println("valor invalido!");
		}
		sc.close();
	}
}
