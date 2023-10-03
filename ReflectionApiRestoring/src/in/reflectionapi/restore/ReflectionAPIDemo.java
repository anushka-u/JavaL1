package in.reflectionapi.restore;
import java.lang.reflect.Field;

public class ReflectionAPIDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Class clz = Class.forName("java.reflectionapi.Student");
		Field[] field = clz.getDeclaredFields();
		for(Field f : field)
		{
			System.out.println(f.getName());
		}

	}

}
