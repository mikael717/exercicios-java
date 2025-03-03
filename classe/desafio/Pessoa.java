package classe.desafio;

public class Pessoa {

	String nomePessoa;
	double pesoPessoa;
	
	Pessoa (){ //criando um construtor vazio
		
	}
	
	Pessoa (String nomePessoa,double pesoPessoa){
		this.nomePessoa = nomePessoa;
		this.pesoPessoa = pesoPessoa;
	}
	
		//void para não ter nenhum "return"
	  void comer(Comida comida) { //parâmetro do método pode receber tanto um tipo primitivo quanto o outro objeto
		  if(comida != null) {
			  this.pesoPessoa += comida.pesoComida; //atribuição aditiva para o valor do peso pessoal;
		  }
	}
	  String apresentar() {
		  return "Ola eu sou o " + nomePessoa +" e peso " + pesoPessoa + " kg.";
	  }
	 
}
