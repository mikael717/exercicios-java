package classe;

public class DataTeste {

	public static void main(String[] args) {
		Data d1 = new Data(14,05,2024);
		/*
		 * d1.dia = 12; d1.mes = 5; d1.ano = 2024;
		 */
		
		var d2 = new Data();
		d2.dia = 10; // como o valor não é static, pode-se fazer a alteração

		System.out.println(d1.obterDataFormatada());
		System.out.print(d2.obterDataFormatada());
	}
}
