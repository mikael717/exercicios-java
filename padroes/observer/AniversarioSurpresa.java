package padroes.observer;

public class AniversarioSurpresa {

	public static void main(String[] args) {
		Porteiro porteiro= new Porteiro();//porteiro é o Subject; responsável pelo monitoração.
		
		Namorada namorada = new Namorada();
		porteiro.registrarObservador(namorada);//obsevador é a namorada (interessada no evento).
		
		porteiro.registrarObservador(e ->{
			System.out.println("surpresa via Lambda!");
			System.out.println("ocorreu em: "+ e.getMomento());
		});
		
		porteiro.monitorar();
	}
}
