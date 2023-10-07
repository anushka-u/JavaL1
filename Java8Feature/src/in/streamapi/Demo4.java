package in.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Mapping demo
		
		List<String> list = Arrays.asList("India","U.S.A","U.S","Uganda");
		list.stream().map(name -> name.toUpperCase()).forEach(name -> System.out.println(name));
		
		//mapToInt()
		list.stream().mapToInt(name -> name.length()).forEach(i -> System.out.println(i));
		
	}

}
