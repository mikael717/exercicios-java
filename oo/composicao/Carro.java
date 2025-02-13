package oo.composicao;

public class Carro { //classe carro

	Motor motor = new Motor(); //é possível dentro de uma classe ter como atributo um outra classe já criada.
	//para cada novo carra terá um novo motor;
	void acelerar() {
		if(motor.fatorInjecao < 2.6) {
			motor.fatorInjecao += 0.4;
		}
		
	}
	
	void frear() {
		if(motor.fatorInjecao >0.5) {
			motor.fatorInjecao -= 0.4;
		}
		
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
}
