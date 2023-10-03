package com.codes;
import java.lang.reflect.*;

public class AccessingPrivateUsingReflectionAPI {
	public static void main(String...strings) throws Exception
	{
		//loading class into JVM
		Class Name = Class.forName("com.codes.Student");
		//Creating instance of class
		Object obj = Name.newInstance();
		//Calling getDeclaredField() to get all variable present inside the class
		Field field = Name.getDeclaredField("id");
		//setAccessible(true) will allow us to set the value for private variable
		field.setAccessible(true);
		//setting the value
		field.set(obj, 1);
		//getting the value
		System.out.println(field.get(obj));
		
	}

}
