package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());;
		}
		
		try {
			geraErro2();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println("fim!!");
	}
	
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro massa #1");
	}
	
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro massa #2");
	}
}
