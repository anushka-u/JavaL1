package in.streamapi;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Filter the names that starts with "A"
		ArrayList<String> list = new ArrayList<>();
		list.add("Supriya");
		list.add("Kaamya");
		list.add("Apoorva");
		list.add("Suhana");
		list.add("Aditi");
		list.add("Anokhi");
		
		Stream<String> stream = list.stream().filter(i -> i.startsWith("A"));
		System.out.println(stream.collect(Collectors.toList()));
		
		//Filtering users whose age are greater than and equal to 18
		ArrayList<User> user =  new ArrayList<>();
		user.add(new User("Amamya",23));
		user.add(new User("Mrunal",21));
		user.add(new User("Anokhi", 12));
		user.add(new User("Paakhi",18));
		user.add(new User("Rushaq",16));
		
		user.stream().filter(p-> p.age >=18).filter(nm -> nm.name.startsWith("A")).forEach(i -> System.out.println(i));
		
	}

}

class User{
	String name;
	int age;
	
	User (String name, int age)
	{
		this.name = name;
		this.age= age;
	}
	
	public String toString()
	{
		return name + " " +age;
	}
}
