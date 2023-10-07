package in.streamapi;

import java.util.Arrays;
import java.util.List;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> name = Arrays.asList("Ashoka", "Aanya","Arpana","Arvind","Bobby","Catheline");

		//Approach 1 to print the names from list which start with A and their respective length
		name.stream().filter(n -> n.startsWith("A")).forEach(i -> System.out.println(i + "-" + i.length()));
		
		//Approach 2 by using both filter and map to get the length of names that start with A
		name.stream().filter(i -> i.startsWith("A")).map(i -> i.length()).forEach(i ->System.out.println(i));
	}

}
