package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		/*
		 * 1. Número para String binária... 3>> "001"
		 * 2. Inverter a String... "110" >> "011"
		 * 3.Converter de volta para inteiro... "001" >> 3
		 * 
		 */
		
		UnaryOperator<String> inverter = s-> new StringBuilder(s).reverse().toString();
		Function<String, Integer> binarioParaInt = s -> Integer.parseInt(s,2); // segundo parametro = 2, entende q está passando uma String binária
		//começando pela final
		nums.stream().map(Integer::toBinaryString) //função em Integer
			.map(inverter)
			.map(binarioParaInt)
			.forEach(System.out::println);
		
	}
}
