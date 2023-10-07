package in.newfeatures;
import java.lang.String;

@FunctionalInterface
interface Funcinterface{
	public void getStringLength(String n);
}

@FunctionalInterface
interface ZeroParamInterface{
	public void m1();
}

@FunctionalInterface
interface TwoParamInterface{
	public int add(int x, int y);
}
public class Demo1 {

	public static void main(String[] args) {
		/**/// TODO Auto-generated method stub
		String name = "Anushka";
		Funcinterface fobj = (n) ->  System.out.println(name.length());
		fobj.getStringLength(name);
		
		
		ZeroParamInterface zpi = () -> System.out.println("Abstract of interface with zero params");
		zpi.m1();
		
		int a =4, b=8;
		TwoParamInterface tpi = (x,y) ->  x+y;
		System.out.println(tpi.add(a, b));
	}

}
