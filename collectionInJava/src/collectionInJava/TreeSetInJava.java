package collectionInJava;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Tree set will maintain natural sorting order
		 * Binary tree
		 * null not allowed
		 * In Tree Set only homogeneous value is allowed
		 * The reason it doesn't contain heterogeneous order is because it maintains natural sorting order
		 * it does compare value with it's previous value to maintain sorted order
		 * if we will add a string and number then comparison will fail
		 */
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(234);
		treeSet.add(78);
		treeSet.add(12);
		treeSet.add(32);
		treeSet.add(1);
		
		System.out.println(treeSet);
		
		Iterator itr = treeSet.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+ " ");
		}

	}

}
