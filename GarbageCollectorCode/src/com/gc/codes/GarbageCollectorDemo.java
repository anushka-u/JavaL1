package com.gc.codes;

public class GarbageCollectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GarbageCollectorDemo gcd = new GarbageCollectorDemo();
		gcd  = null; // //here we are nullifying the object
		//System.gc(); // Most probably our JVM will not call the garbage collector and also s1 is referenced
		
		String s1 = new String("Hello");
		s1 = null;
	
		System.gc();
		
		//We can also call Garbage collector by calling Runtime method
		//Runtime.getRuntime().gc();
		
	}
	protected void finalize() throws Throwable
	{
		System.out.println("Finalized Method called here");
	}

}
