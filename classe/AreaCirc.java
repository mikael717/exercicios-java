package classe;

public class AreaCirc {

	double raio;
	static double pi = 3.14;
	
	AreaCirc(double raioInicial) {	//construtor possuibilita a criação de um objeto
	raio = raioInicial;
	}
	

	double area() { //método
		return pi* Math.pow(raio, 2);
	}
	//2 possiveis métodos que podem ser usados caso a assinatura seja diferente(neste caso os paramêtro);
	static double area(double raio) { //método
		return pi* Math.pow(raio, 2);
	}
}
