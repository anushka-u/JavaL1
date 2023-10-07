package in.streamapi;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Approach 1
		Stream<Integer> stream1 = Stream.of(2,5,3,6,8);
		
		ArrayList<Integer> name = new ArrayList<>();
		name.add(2);
		name.add(4);
		name.add(1);
		name.add(5);
		
//Approach 2
		Stream<Integer> stream2 = name.stream();
		ArrayList<Integer> l2 = new ArrayList();
		l2 = (ArrayList<Integer>) stream2.filter(i-> i%2 == 0).collect(Collectors.toList());
		 System.out.println(l2);
	}

}
