package in.newfeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AgeGreaterPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Anushka",22));
		persons.add(new Person("Aastha",18));
		persons.add( new Person("Rumya",14));
		persons.add(new Person("kushal",25));
		
		
		Predicate<Person> predicate = p -> p.age >= 18;
		
		for(Person person : persons)
		{
			if(predicate.test(person))
			{
				System.out.println(person.name);
			}
		}
		
	}

}
