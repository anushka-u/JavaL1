package collectionInJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> al =  new ArrayList<>();
		
		al.add(new Employee(104,"Parul",1234.098));
		al.add(new Employee(102,"Kishore",123312.00));
		al.add(new Employee(103,"Rajan",45000.00));
		al.add(new Employee(101,"Kiran",95000.00));
		//implemented comparator is sorting based on descending order
		Collections.sort(al, new EmpIdComparator());
		for(Employee e: al)
		{
			System.out.println(e);
		}
		//Anonymous implementation of comparator
		Collections.sort(al,new Comparator<Employee>(){

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
			
		});
		for(Employee e: al)
		{
			System.out.println(e);
		}
		

	}

}
