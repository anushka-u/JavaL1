package in.newfeatures;

interface MyInterface
{
	public void m1();
}
public class MethodReferences {

	public static void m2()
	{
		System.out.println("Hii");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface mI = MethodReferences::m2;
		mI.m1();
		

	}

}
