package collectionInJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * In Map duplicates aren't allows, Key should be unique in MAp
		 * one key-value pair is called as one entry
		 * We can take Key&value any type of data
		 * 
		 * Map Interface having several implementation classes
		 * HashMap
		 * LinkedHashMap
		 * TreeMap
		 * Hashtable
		 * IdentityHashMap
		 * WeakHashMap
		 */

		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Anushka");
		map.put(2, "Ishu");
		map.put(3, "Bhaiya");
		
		
		//get(k) used to get thr value based on the key
		System.out.println(map.get(2));
		
		//remove(k) to remove one entry based on given key
		String name =map.remove(1);
		System.out.println(name + " Removed from map");
		
		map.put(1, "Anushka");
		
		//containseKey(k) check whether map contains the key or not
		System.out.println("Checking whether map contains key 1 or not :: "+map.containsKey(1));
		
		//keySet() will print all the keys present in map
		System.out.println("KeySet inside map :: "+map.keySet());
		
		//values() will print all the values present inside the key
		System.out.println("Values Present in map:: "+map.values());
		
		//size() used to get number of entry available in map
		System.out.println("Size of map :: "+map.size());
		
		//print key value pair in map
		System.out.println(map);
		
		//replace a value with another
		map.replace(3, "Vishal");
		System.out.println("Values Present in map:: "+map.values());
		
		Set<Entry<Integer,String>> entrySet = map.entrySet();		
		Iterator<Entry<Integer,String>> iterator = entrySet.iterator();
		while(iterator.hasNext())
		{
			Entry<Integer,String> entry = iterator.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		
		//For each loop
		System.out.println("Using for each loop");
		for(Entry<Integer,String>entry : entrySet)
		{
			System.out.println(entry.getKey()+ " " + entry.getValue());
		}
	}
	

}
