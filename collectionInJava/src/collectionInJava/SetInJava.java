package collectionInJava;

import java.util.HashSet;

public class SetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Set is an interface in java, it implements Collection interface
		 * java.util package
		 * is used to store group of object
		 * duplicates aren't allowed
		 * Hetro and homo both kind of object are supported
		 * 
		 *Implementation object available for Set Interface are --
		 *HashSet, LinkedSet, TreeSet.
		 *
		 *
		 *HAshSet is implementation class of Set interface
		 *Insertion order isn't maintained in hashSet
		 *Null is allowed, duplicates aren't
		 *Default capacity is 16 and load factor is 0.75
		 *Internal Structure is hashtable
		 *
		 */
		HashSet<String> hs = new HashSet<>();
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("one"); 
		hs.add("four");
		
		System.out.println(hs);
		
		hs.remove("one");
		System.out.println(hs);
		
		/**
		 * Constructor in hashSet
		 * HashSet hs = new HashSet();
		 * HashSet hs = new HashSet(int capacity);
		 * HashSet hs = new HashSet(int capacity, float loadFactor); 
		 */
		
		/**
		 * Iterator is called as universal cursor, can be used with list implementation classes as well as set implementation classes
		 * List Iterator can only be used with List implementation classes 
		 * 
		 */
		
		

	}

}
