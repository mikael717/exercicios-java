package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25; // ao criar um static para o desconto não faz mais sentido manter o desconto no parametro do construtor
	//pois o desconto da instância deve está implicito para evitar confuções com o desconto padrão da classe.
	
	//criando construtores
	Produto (){
		
	}
	Produto (String nomeInciail,double precoInicial){
		nome = nomeInciail; //nome recebe nomeIncial
		preco = precoInicial;
		
	}
	
	double precoComDesconto() { //método
		return preco * (1-desconto);
	}
}
