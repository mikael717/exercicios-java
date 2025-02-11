package oo.heranca.desafio;

public class Ferrari extends Carro{

	public Ferrari(){
		this(314);
	}
	
	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima); //outro construtor
		delta = 201; // ao chamar o delta e sobreescrever, já não é necessário override o metedo acelerar
	}
	
	/*
	 * @Override void acelerar() { super.acelerar(); }
	 */
}
