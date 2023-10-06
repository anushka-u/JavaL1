package collectionInJava;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> s = new HashSet<>();
		s.add(new Student(101,"Raju"));
		s.add(new Student(102,"Rani"));
		s.add(new Student(103,"Rastogi"));
		
		Iterator<Student> itr = s.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+ " ");
		}
	}

}
