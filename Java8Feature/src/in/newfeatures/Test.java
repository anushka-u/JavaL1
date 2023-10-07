package in.newfeatures;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Doctor> s =Doctor :: new;
		System.out.println(s.get().hashCode());

	}
}
class Doctor{
	
	public Doctor()
	{
		System.out.println("Constructor Reference");
	}
}

