package collectionInJava;

import java.util.Comparator;

public class EmpIdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
//		if(o1.roll>o2.roll)
//		{
//			return 1;
//		}
//		else if(o1.roll<o2.roll)
//		{
//			return -1;
//		}
//		else
//		{
//			return 0;
//		}
		
		//To print in descending order 
		if(o1.roll>o2.roll)
		{
			return -1;
		}
		else if(o1.roll<o2.roll)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		//return o1.roll - o2.roll;
		//return o1.name.compareTo(o2.name);
	}
	
	

}
