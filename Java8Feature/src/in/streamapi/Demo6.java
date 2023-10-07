package in.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo6 {
//Task : Using Stream API fetch those employee whose salary are greater than 50000.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee("Arjun",23, 30000));
		emp.add(new Employee("Raanya",21, 52000));
		emp.add(new Employee("Shekhar",25, 50000));
	//way 1	
	emp.stream().filter(p -> p.salary >= 50000).forEach(i -> System.out.println(i.name + " "+ i.age));
	
	//way 2
	emp.stream().filter(p->p.salary>=50000).map(e -> e.name + " "+e.age).forEach(e-> System.out.println(e));;

	//Find employee max salary, min salary and avg salary
	Optional<Employee> maxSal =emp.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.salary)));
	System.out.println(maxSal.get());
	
	}

}

class Employee{
	String name;
	int age;
	double salary;
	
	Employee(String name, int age, double salary)
	{
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
}
