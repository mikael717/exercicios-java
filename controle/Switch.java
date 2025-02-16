package controle;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String conceito = "";
		System.out.print("Informe a nota: ");
		int nota= entrada.nextInt(); //definir que a nota será lida como entrada
		switch (nota) {
		case 10: case 9: { //calor da variável NOTA definido no switch
			conceito ="A";
			break;
		}
		case 8: 
		case 7:
		
			conceito="B"; // não é necessário criar um novo bloco de código para os cases, neste caso os cases estão todos no mesmo bloco
			break;
		
		case 6: case 5: 
			conceito="C";
			break;
		
		case 4: case 3:{
			conceito="D";
			break;
		}
		case 2: case 1:{
			conceito = "F";
			break;
		}
		default:
			conceito = "nenhum valor encontrado";
		}
		System.out.println("Conceito eh " + conceito);
		
		entrada.close();
	}
}
