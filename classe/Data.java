package classe;

public class Data {
 // dia, mes e ano
	
	int dia;
	int mes;
	int ano;
	
	Data (){
		/*
		 * dia = 01; mes = 01; ano = 1970;
		 */
		this(01,01,1970); //chamando um construtor dentro de outro construtor com o this (usado como método)
	}
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes; //evidenciando com o this qual a variável da instância e qual o parâmetro do construtor, apesar do mesmo nome.
		this.ano = ano;
	}
	
	  String obterDataFormatada() { 
		  return String.format("%d/%d/%d",this.dia,mes,ano);  // notação ponto, chama a instância format para formatar o retorno da string;
	  } 									//this não se faz necessário aqui visto que não há conflito, contudo tbm é possível.
	 
}
