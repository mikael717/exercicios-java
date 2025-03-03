package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Comida c1 = new Comida();
		c1.nomeComida = "Lasanha";
		c1.pesoComida = 0.132;
		//Comida c2 = new Comida("Feijao", 0.311);
		
		
		Pessoa p1 = new Pessoa ("Carla", 60.2);
		
		
		System.out.println(p1.apresentar());//neste caso chame-se o objeto criado nesta classe
		p1.comer(c1);
		System.out.println(p1.apresentar());
		p1.comer(c1);
		System.out.println(p1.apresentar());
		
	}
}
