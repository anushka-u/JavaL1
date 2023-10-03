package in.generics;

//import java.util.ArrayList;

public class TypeSafetyUsingGeneric<T1> {
	
	T1 obj;
	
	
	TypeSafetyUsingGeneric(T1 obj)
	{
		this.obj = obj;
	}
	void m1(T1 obj)
	{
		System.out.println(obj);
	}
	
	T1 get()
	{
		return obj;
		
	}
	
	public static void main(String[] args)
	{
		TypeSafetyUsingGeneric<Integer> d1 = new TypeSafetyUsingGeneric<>(1);
		d1.m1(23);
		TypeSafetyUsingGeneric<String> d2 = new TypeSafetyUsingGeneric<>("hello");
		d2.m1("hello");
		TypeSafetyUsingGeneric<Double> d3 = new TypeSafetyUsingGeneric<>(123.87653);
		d3.m1(1234.543321);
		
		
		
	}

}
