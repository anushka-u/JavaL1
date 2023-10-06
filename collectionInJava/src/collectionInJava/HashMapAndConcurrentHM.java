package collectionInJava;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.WeakHashMap;

public class HashMapAndConcurrentHM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hashmap diesn't let us store duplicate, it compares the key using equals()
		HashMap<String,Integer> hm= new HashMap<>();
		hm.put("Anushka", 1);
		hm.put("Bhanu", 2);
		hm.put("Chandra", 3);
		hm.put("Deepesh", 4);
		hm.put("Anushka", 12);
		
		System.out.println(hm);
		System.out.println(hm.size());
		
		
		//Identity hash map compares address of object using == operator, 
		//
		IdentityHashMap<String,Integer> ihm = new IdentityHashMap<>();
		ihm.put("Anushka", 1);
		ihm.put("Bhanu", 2);
		ihm.put("Chandra", 3);
		ihm.put("Deepesh", 4);
		ihm.put(new String("anushka"),101); //our above four key will store inside SCP, here we are using new operator
		//which is creating our object in heap area and the address of first entry and fourth entry will be different that's y it will store the value in IdentityHashMap
		ihm.put("Anushka", 8); // it has replaced first entry value because key is duplicate.
		

		System.out.println(ihm);
		
		WeakHashMap <Integer,String> whm = new WeakHashMap<>();
		whm.put(1, "hi");
		whm.put(2, "hello");
		whm.put(3, "byee");
		whm.put( 4, "Soya");
		
		System.out.println(whm);
	}

}
