package collectionInJava;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ColectionsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> arr = new ArrayList<>();
		arr.add(2);
		arr.add(4);
		arr.add(6);
		arr.add(45);
		arr.add(12);
		arr.add(1);
		
		ArrayList <Integer> brr = new ArrayList<>();
		brr.add(45);
		
		System.out.println(arr);
		
		Collections.sort(arr);
		System.out.println(arr);
		
		Collections.emptyList();
		System.out.println(arr);
		
		System.out.println(Collections.binarySearch(arr, 45));
		
	}

}
