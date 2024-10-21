/*
--------------------------------
| DDD  | Destination           |
| 61   | Brasilia              |
| 71   | Salvador              |
| 11   | São Paulo             |
| 21   | Rio de Janeiro        |
| 32   | Juiz de Fora          |
| 19   | Campinas              |
| 27   | Vitoria               |
| 31   | Belo Horizonte        |
--------------------------------

 Entrada
Consiste de um único valor inteiro.

Saída
Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima 'DDD nao cadastrado' caso não existir DDD correspondente ao número digitado.
 
-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
| 11                 | São Paulo        |
-----------------------------------------
*/

import java.io.IOException;
import java.util.Scanner;

public class DDD {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o DDD: ");
        int ddd = sc.nextInt();
        
        switch (ddd) {
            case 11:
                System.out.println("São Paulo");
                break;
            case 19:
                System.out.println("Campinas");
                break;
            case 21:
                System.out.println("rio de janeiro");
                break;
            case 27:
                System.out.println("Vitória");
                break;
            case 31:
                System.out.println("Belo Horizonte");
                break;
            case 32:
                System.out.println("Juiz de Fora");
                break;
            case 61:
                System.out.println("Brasília");
                break;
            case 71:
                System.out.println("Salvador");
                break;
        
            default: System.out.println("DDD nao cadastrado!");
                break;
        }

        sc.close();
    }
}
