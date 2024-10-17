/*
Saída
Exiba todos os números pares até o valor de entrada, sendo um em cada linha. 

-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
| 4	                 | 0                |
|                    | 2                |
|                    | 4                |
-----------------------------------------


SOLUÇÃO ABAIXO: */

import java.util.Scanner;

public class ExibirNumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite um numero: ");
        int numero = sc.nextInt();

        for(int i = 0; i <= numero; i++){
            if(i%2 == 0) System.out.println(i);
        }

        sc.close();
    }
}
