package oo.polimorfismo;

public class Pessoa {

private double peso;
	
	//construtor
	public Pessoa(double peso) {
		setPeso(peso);
	}
	
	public void comer (Comida comida) { // ao comer o arroz acrescenta-se o peso do arroz ao peso da pessoa;
		this.peso += comida.getPeso();
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;			
		}
	}
}
