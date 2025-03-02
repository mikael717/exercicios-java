package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc (10); //construtor de paramêtro 10 (valor raioInicial)
		//criando o objeto a1 a partir do construtor intanciado na classe
		//double valorA1 = a1.area();
		System.out.println(a1.area());
		
		//AreaCirc a2 = new AreaCirc(50);
		System.out.println("nova area "+AreaCirc.area(100));
	}
}
