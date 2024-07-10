package exercicios.exerciciosMatrizes;
import java.util.Locale;
import java.util.Scanner;
//editando diretamente no GitHub
public class exDiagonalNeg {
    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Qual a ordem da matriz? ");
       int n = sc.nextInt();

       int [][] mat = new int [n][n]; 
       
        for (int i = 0; i<n; i++){ //lendo toda a matriz;
            for(int j=0; j<n; j++){
                System.out.print("Elemento ["+i+","+j+"]: ");//concatenando as variáveis;
                mat[i][j] = sc.nextInt(); //lendo os valores
            }
        }

        System.out.print("DIAGONAL PRINCIPAL: ");
        for(int i=0; i<n; i++){
            System.out.print(mat[i][i] + " ");
        }
        System.out.println(); //apenas para quebra de linha

        int negativos = 0;

        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(mat[i][j]<0){
                    negativos++;
                }
            }
        }
        System.out.println("QUANTIDADE DE NEGATIVOS " + negativos);
        sc.close(); 
    }
    
}
