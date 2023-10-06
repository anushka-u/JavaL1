package collectionInJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsForStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//I want to perform sorting on User defined object
		ArrayList<Student> al =  new ArrayList<>();
		al.add(new Student(104,"Parul"));
		al.add(new Student(102,"Kishore"));
		al.add(new Student(103,"Rajan"));
		al.add(new Student(101,"Kiran"));
		
		
		Collections.sort(al);
		
		for(Student s: al)
		{
			System.out.println(s);
		}
		
		
		//Sort method of collections doesn't sort our User defined object, so if we want to use
		//sort() in our user defined object then we have to implement comparable or comparator in our user defined class
		//It's working on Integer coz Integer is a wrapper class and it's already implementing comparable 
		
	}

}
