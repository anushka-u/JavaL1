package collectionInJava;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("John");
		queue.add("Anushka");
		queue.add("Naina");
		queue.add("Pramila");
		
		System.out.println(queue);
		
		Iterator<String> iterator = queue.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		System.out.println(queue.peek());
		System.out.println(queue.element());
		
		System.out.println(queue.remove());
	}

}
