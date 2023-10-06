package collectionInJava;

import java.util.Enumeration;
import java.util.Vector;

public class VectorInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**Vector class is a legacy class, it is available from java jdk v1.0
		Vector class is thread safe where ArrayList isn't.
		Internal data structure is growable array
		ordered - will maintain insertion order
		Synchronized
		Legacy cursor is enumeration to traverse vector, Vector class is less used class*/
 
		Vector<Integer> v = new Vector<>();
		v.add(20);
		v.add(30);
		v.add(49);
		v.add(null);
		
		//LEgacy cursor enumeration can only be used with legacy class
		Enumeration<Integer> element = v.elements();
		while(element.hasMoreElements())
		{
			System.out.println(element.nextElement());
		}
		
	}

}
