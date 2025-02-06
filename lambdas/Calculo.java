package lambdas;

@FunctionalInterface

public interface Calculo {

	double executar (double a, double b);
	
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() { //método static está relacionado diretamente à Interface != das instâncias;
		return "muito legal";
	}
}
