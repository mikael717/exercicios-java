package lambdas;

public class CalculoTeste1 {

	public static void main(String[] args) {
		
		Calculo calculo = new Somar();
		System.out.println(calculo.executar(2, 3));
	
		calculo = new Multiplicar(); //nova implementação usando o polimorfismo
		System.out.println(calculo.executar(2, 3));
		
	}
}
