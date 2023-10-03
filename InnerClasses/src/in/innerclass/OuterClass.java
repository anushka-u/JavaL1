package in.innerclass;

public class OuterClass {

	void outerMethod()
	{
		InnerClass i = new InnerClass();
		i.innerMethod();
		System.out.println("Method of Outer Class");
		
	}
	public static void main(String...strings )
	{
		OuterClass oc = new OuterClass();
		oc.outerMethod();

	}
	//cannot be accessed by anyone other than outerclass
    class InnerClass{
		void innerMethod()
		{
			System.out.println("Method of Inner Class");
		}
	}
	

}
