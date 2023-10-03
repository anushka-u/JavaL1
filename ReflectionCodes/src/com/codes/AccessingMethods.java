package com.codes;
import java.lang.reflect.*;
public class AccessingMethods {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class clz = Class.forName("com.codes.Student");		
		Method method = clz.getDeclaredMethod("m1");
		Object obj = clz.newInstance();

		method.invoke(obj, null);

	}

}
