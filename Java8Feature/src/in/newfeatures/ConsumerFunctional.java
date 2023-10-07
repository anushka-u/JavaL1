package in.newfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consumer<String> c = (name) -> System.out.println(name + " Good Evening");
		c.accept("Anushka");
		c.accept("Mrigal");
		c.accept("kusum");
		
		
		List<Integer> number = Arrays.asList(10,20,30,40,50);
		number.forEach(i->System.out.println(i));
		
	}

}
