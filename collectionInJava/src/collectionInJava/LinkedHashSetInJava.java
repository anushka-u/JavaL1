package collectionInJava;

import java.util.LinkedHashSet;

public class LinkedHashSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
 * Implements class for Set interface
 * Duplications aren't allowed
 * LinkedHashSet maintains insertion order
 * Internal data structure is Hash table plus double linked list concept
 * available from 1.4
 * Initial capacity is 16, load factor is 0.75
 * 
 */
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(10);
		linkedHashSet.add(30);
		linkedHashSet.add(20);
		linkedHashSet.add(null);
		linkedHashSet.add(40);
		
		System.out.println(linkedHashSet);
		
	}

}
