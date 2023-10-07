package in.streamapi;

import java.util.Arrays;
import java.util.List;

public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> javaCourse = Arrays.asList("CoreJava","Advance Java","Java","RESTAPI","SPRINGBOOT");
		javaCourse.stream().limit(3).forEach(c -> System.out.println(c));
		javaCourse.stream().skip(2).forEach(c->System.out.println(c));
		
		List<String> names = Arrays.asList("Raja","Riya", "Rupa","Raja","Rashi","Ruhana");
		names.stream().distinct().forEach(name -> System.out.println(name));

	}

}
