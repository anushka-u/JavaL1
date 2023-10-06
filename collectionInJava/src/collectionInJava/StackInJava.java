package collectionInJava;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;


public class StackInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stack was introduced in java jdk v1.0, so it's also a legacy class
		//Our legacy cursor enumerator will also work with Stack.
		Stack s =new Stack();
		s.push(10);
		s.push(23);
		s.push(30);
		s.push(40);
		
		System.out.println(s.peek());
		ListIterator itr = s.listIterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next() + " ");
		}
		s.pop();
		
		Enumeration element =s.elements();
		while(element.hasMoreElements())
		{
			System.out.print(element.nextElement());
		}
		

	}

}
