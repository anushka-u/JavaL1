package in.newfeatures;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintNumber {
	
	public void m1()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PrintNumber printNumber = new PrintNumber();
//		Runnable r = printNumber::m1;
//		Thread t = new Thread(r);
//		t.start();
//		
		//Approach 2
		 Runnable r1 = () -> {
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
			}
		};
		
		Thread t1  = new Thread(r1);
		t1.start();
		
		
		Callable c= () ->{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
			}
			return t1;
		};
		ExecutorService  exService = Executors.newFixedThreadPool(1);
		exService.submit(c);
		exService.shutdown();
		
	}

}
