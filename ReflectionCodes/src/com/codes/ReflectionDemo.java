package com.codes;
import java.lang.reflect.Field;
import java.lang.reflect.*;
public class ReflectionDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method 
		
		Class name = Class.forName("com.codes.Student");
		Field[] field = name.getDeclaredFields();
		System.out.println("==================");
		System.out.println("Variables");
		for(Field f:field)
		{
			System.out.println(f.getType());
			System.out.println(f.getName());
			System.out.println(f.getModifiers());
		}
		System.out.println("===========================");
		System.out.println("Methods");
		Method[] method = name.getDeclaredMethods();
		for(Method m: method)
		{
			System.out.println(m.getName());
		}
		System.out.println("============================");
		System.out.println("Constructors");
		Constructor[] constructor = name.getDeclaredConstructors();
		for(Constructor c: constructor)
		{
			System.out.println(c.getName());
		}

	}

}
