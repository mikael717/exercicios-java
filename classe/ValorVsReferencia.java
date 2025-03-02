package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribuição por Valor (Tipo Primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1,5,2024);
		Data d2 = d1; // atribuição por Referência (OBJETO)
		
		d1.dia= 31;
		d2.mes= 12;
		
		d1.ano = 2031;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
	
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		int c = 5;
		alterarPrimitivio(c);
		System.out.println(c);
		
	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 01;
		d.mes = 01;
		d.ano = 2029;
	}
	static void alterarPrimitivio(int c) {
		c++;
	}
}
