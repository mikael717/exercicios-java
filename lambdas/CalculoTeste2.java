package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		Calculo calc = (x,y) -> {return x + y; }; // lambda fuction ou seja uma função anônima
		System.out.println(calc.executar(2, 3));
		
		calc = (x, y) -> x * y; // ao não usar as {} o retorno da expressão fica implicito 
		System.out.println(calc.executar(2, 3));
		
		System.out.println(calc.legal());
		
		System.out.println(Calculo.muitoLegal());
	}
}
