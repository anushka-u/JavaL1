package in.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo7 {

	//A collection inside another collection - the concept which will be used is flat map
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> javaCourse = Arrays.asList("CoreJava","Advance Java","Java");
		List<String> uiCourse = Arrays.asList("html","CSS","BOOTSTRAP","JAVASCRIPT");
		List<List<String>> course = Arrays.asList(javaCourse, uiCourse);
		Stream<String> flatMap = course.stream().flatMap(s->s.stream());
		flatMap.forEach(c->System.out.println(c));
		

	}

}
