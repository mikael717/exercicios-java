package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c1 = new Civic();
		c1.acelerar();
		System.out.println(c1);
		
		c1.frear();
		c1.frear();
		System.out.println(c1);
		
		Ferrari c2 = new Ferrari(); // o parametro define a velocidade maxima da ferrari
		// c2.veloAtual = 200;
		 		
		c2.acelerar();
		c2.acelerar();
		System.out.println(c2);
		
		c2.frear();
		System.out.println(c2);
	}
}
