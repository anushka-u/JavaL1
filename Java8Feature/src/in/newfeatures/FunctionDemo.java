package in.newfeatures;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<String, Integer> function = name -> name.length();
		System.out.println(function.apply("Anushka"));
		System.out.println(function.apply("Bora Bora"));
		
		BiFunction<Integer, Integer, Integer> function2 = (i,j) -> i+j;
		Integer sum  = function2.apply(5,8);
		System.out.println(sum);
	
	}

}
