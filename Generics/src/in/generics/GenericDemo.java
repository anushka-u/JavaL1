package in.generics;

public class GenericDemo<T> {
	T obj;
	
	//method independent of data type
	public void m1(T i)
	{
		System.out.println("I am generic method, You can send any type of argument to me "+ i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericDemo gd = new GenericDemo();
		gd.m1("hi"); //string
		gd.m1( 101); //integer
		gd.m1(12.43f); //float
	}

}
