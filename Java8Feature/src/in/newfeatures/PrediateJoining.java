package in.newfeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PrediateJoining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Rastogi" , "Pune", "Devops"));
		emps.add(new Employee("Aanandi" , "Hyderabad" , "DB"));
		emps.add(new Employee("Kishore","Hyderabad","DB"));
		emps.add(new Employee("Kulsum" , "Hyderabad","DB"));
		
		Predicate<Employee> p1 = e -> e.location.equals("Hyderabad");
		Predicate<Employee> p2 = e -> e.dept.equals("DB");
		
		//Predicate joining
		Predicate<Employee> p = p1.and(p2);
		
		//If we want employee who satisfies any one of condition
		//Predicate<Employee> p = p1.or(p2);
		
		
		for(Employee e : emps)
		{
			if(p.test(e))
			{
				System.out.println(e.name);
			}
		}
		
	}

}
