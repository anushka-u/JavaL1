package in.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l1 = Arrays.asList(34,23,87,2,1,54,43);
		//check whether the element in list l1 is greater than 20 or not
		 l1.stream().filter(i->i>20).forEach(i-> System.out.println(i));
		
		
		System.out.println();
		//Check whether the element in list l1 is odd or not 
		 l1.stream().filter(i -> i%2 !=0).forEach(j->System.out.println(j));
		 
		 
		 
	}

}
