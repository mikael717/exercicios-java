/*
Saída
Para cada entrada, tem de haver um arquivo de saída com quatro linhas, e em cada linha um número inteiro.
exemplo abaixo:

--------------------------------------------
| Exemplos de Entrada  | Exemplos de Saída |
| 999.999.999-99       | 999               |
|                      | 999               |
|                      | 999               |
|                      | 99                |
--------------------------------------------
 */

import java.util.Scanner;
import java.util.Locale;
public class FormatacaoCPF {
    
    public static void main(String[] args) {
        
        Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in); 

        String[] cpf = new String[4];

        System.out.print("Digite o cpf: ");
        cpf= sc.nextLine().split("\\.|-");

        for(int i = 0; i < 4; i++){
            System.out.printf("\n%s", cpf[i]);
        }

        sc.close();
    }
}
