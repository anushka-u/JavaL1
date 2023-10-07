package in.newfeatures;

import java.util.function.Predicate;

public class CheckWithPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Anushka","Anupma","Aastha","Deeksha","Disha"};
		Predicate<String> p = name ->name.startsWith("A");
		
		for(String name : names)
		{
			if(p.test(name)) {
				System.out.println(name);
			}
			
		}
	}

}
