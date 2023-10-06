package collectionInJava;

import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class LinkedListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		//Internally linked list is using doubly linked list
		//In Doubly linked list our object which is basically called as node stores address of it's previous node and next node
		//So it keeps having the link 
		//In linked list adding/indexing a new element at particular index is easy.
		//Retrieving an element in linked list is a costly operation
		
		linkedList.add(23);
		linkedList.add(46);
		linkedList.add(98);
		linkedList.add(823);
		//We have plenty of methods defined inside LinkedList class
		//some of them are - add() get() getLast() contains() isEmpty() etcetra.
		
		System.out.println(linkedList.contains(23));
		System.out.println(linkedList.isEmpty());
		System.out.println(linkedList.get(3));
		System.out.println(linkedList.getLast());
		System.out.println(linkedList.remove());
		System.out.println(linkedList.hashCode()); // object ka method h ye
		System.out.println(linkedList.lastIndexOf(823));
		java.util.ListIterator<Integer> itr =linkedList.listIterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+ " ");
		}
		System.out.println();
		
		linkedList.set(1, 948);
		while(itr.hasPrevious())
		{
			System.out.print(itr.previous()+ " ");
		}
	}

}
