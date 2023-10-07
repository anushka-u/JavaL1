package in.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo9 {
//Using Matching Operations With Stream
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> person = new ArrayList<>();
		person.add(new Person("Anushka","India"));
		person.add(new Person("Ruqaiya","Pakistan"));
		person.add(new Person("Johnny","California"));
		person.add(new Person("Heather","Paris"));
		person.add(new Person("Ratan","India"));
		
		boolean status = person.stream().anyMatch(p->p.country.equals("India"));

		System.out.println("Any Person in list is from India: "+status);
		
		boolean status1 = person.stream().allMatch(p->p.country.equals("India"));
		System.out.println("All Person in list is from India: "+status);
		
		boolean status2 = person.stream().noneMatch(p->p.country.equals("India"));
		System.out.println("No Person in list is from India: "+status2);
		
		Optional<Person> obj = person.stream().filter(p->p.country.equals("India")).findFirst();
		if(obj.isPresent())
		{
			System.out.println(obj.get());
		}
		
		List l2 = new ArrayList();
		l2 = person.stream().filter(p->p.country.equals("India")).collect(Collectors.toList());
		System.out.print(l2);
	}

}

class Person{
	String name;
	String country;
	
	Person(String name, String country)
	{
		this.name = name;
		this.country = country;
	}
	
	public String toString()
	{
		return name;
	}
}