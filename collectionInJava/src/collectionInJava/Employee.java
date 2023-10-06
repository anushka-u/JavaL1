package collectionInJava;

import java.util.Comparator;

public class Employee {

	public int roll;
	public String name;
	public double salary;

	Employee(int roll, String name,double salary) {
		// TODO Auto-generated constructor stub
		this.roll = roll;
		this.name =name;
		this.salary = salary;
		
	}
		
		public String toString()
		{
			return roll + " "+name + " " + salary;
		}

}
