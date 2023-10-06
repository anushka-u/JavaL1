package collectionInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List is an interface, we cannot create an object of interface but we can create object of class implementing the interface and store that object in interface variable
		List l = new ArrayList();
		
		// The add method of ArrayList adds the value at the end of ArrayList
		l.add(120);
		l.add(220);
		l.add(110);
		l.add(210);
		l.add(100);
		l.add(200);
		
		//If you want to add many values all at once you can go with addAll() method where you can pass the index and collection
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l.addAll(0, l1);
		
		//To Print the ArrayList without iterating we can go with 
		System.out.println(l);
		
		//To find the first occurrence of an element we can use indexOf() method
		System.out.println(l.indexOf(100));
		
		//To remove an element from ArrayList we can use remove() Method, remove() has two method where in one it takes value you want to remove and in another it takes the index whose value you want to remove
		l.remove(2);
		
		System.out.println(l);
		//To get value at particular index you can use get()
		System.out.println(l.get(4));
		
		//To know the last occurrence of an element in list we can use lastIndexOd()
		System.out.println(l.lastIndexOf(110));
		//To replace a value at a particular index with another we can use set() methos
		l.set(2,440);
		System.out.println(l.indexOf(440));
		
		l.add(0);
		System.out.println(l);
		//Ti find the size of collection use size()
		System.out.println(l.size());
		
		boolean ans = l.contains(100);
		System.out.println(ans);
		
		 l.retainAll(l1);
		 System.out.println(l);
		 System.out.println(l1);
		//foreach 
		 for(Object obj:l)
		 {
			 System.out.print(obj+" ");
		 }
		
		 System.out.println();
		//iterator 
		Iterator itr =l.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+ " ");
		}
		
		System.out.println();
		//listiterator - traverse in both direction
		ListIterator litr= l.listIterator();
		while(litr.hasNext())
		{
			System.out.print(litr.next()+ " ");
		}
		System.out.println();
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		//for each method
		l.forEach(i->{
			System.out.print(i + " ");
		});
		System.out.println();
		//To delete all object from collection use clear()
		l.clear();
		System.out.println(l);
		
		boolean ans2 = l.isEmpty();
		System.out.println(ans2);
	}

}
