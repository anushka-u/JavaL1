package collectionInJava;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeCollectionJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Integer> al = new ArrayList<>();
		
		CopyOnWriteArrayList<Integer> al = new CopyOnWriteArrayList<>();
		al.add(100);
		al.add(300);
		al.add(400);
		al.add(600);
		
		for(Integer i : al)
		{
			System.out.println(i);
			if(i==100)
			{
				al.add(150);
			}
		}
	}

}
