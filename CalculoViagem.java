import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CalculoViagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> lista = null;

        while (lista == null || lista.size() < 2) {
            System.out.println("Insira o tempo gasto e a velocidade média");
            lista = Arrays.asList(sc.nextLine().split(" "))
                    .stream()
                    .map(valor -> {
                        try {
                            return Double.parseDouble(valor);
                        } catch (NumberFormatException e) {
                            System.out.println("Por favor, insira apenas números validos.\n");
                            return null;
                        }
                    })
                    .filter(valor -> valor != null)
                    .collect(Collectors.toList());

        }

        Double calculo = (lista.get(0) * lista.get(1) / 12);
        System.out.printf("%.3f", calculo);

        sc.close();
    }
}
