package oo.encapsulamento;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private int idade;
	
	public Pessoa (String nome, String sobrenome, int idade) { //construtor >> ao insvês de usar o [this.idade = idade;] usa-se o método com validador
		setIdade(idade);
		setNome(nome);
		setSobrenome(sobrenome);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getNomeCompleto() { //atributo calculado, o método não chama necessariamente um atributo;
		return getNome() + " " + getSobrenome();
	}

	public int getIdade() { //método usado para leitura do atributo idade;
		return idade;
	}
	public void setIdade(int novaIdade) { //método usado para definir/alterar o atributo idade;
		novaIdade = Math.abs(novaIdade); //definindo um valor absoluto para o novo parametro de novo que TODOS os valores serão transformados em POS;
		if(novaIdade>= 0 && novaIdade <= 120) {//parametro para ter controle sobre alterar a idade;
			this.idade = novaIdade;
		}
	}
	@Override
	public String toString() {
		return "ola eu sou " + getNome() + " e tenho " + getIdade() + " anos";
	}
}
