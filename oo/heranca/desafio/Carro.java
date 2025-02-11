package oo.heranca.desafio;

public class Carro {

	public final int VELOCIDADE_MAXIMA; //valores constantes são escritos em upperCase// dado public que nunca muda;.
	protected double veloAtual;
	protected int delta = 5; //protected transmitindo o método por herança

	protected Carro(int velocidadeMaxima){ //caso não queira permitir a instanciação de um carro diretamente >> protected
		VELOCIDADE_MAXIMA = velocidadeMaxima;//visível por herança
	}
	
	 public void acelerar () {
		if(veloAtual + delta > VELOCIDADE_MAXIMA) {
			veloAtual = VELOCIDADE_MAXIMA;
		}
		else {
			veloAtual += delta;		
		}
	}
	
	public void frear () {
		if(veloAtual >= 5) {			
			veloAtual -= 5;
		}
		else {	
			veloAtual = 0;
		} 
	}

	@Override
	public String toString() {
		
		return "A velocidade atual eh " + veloAtual + " Km/h"; 
	}
}
