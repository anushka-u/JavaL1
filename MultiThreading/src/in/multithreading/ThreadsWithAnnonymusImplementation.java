package in.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadsWithAnnonymusImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadsWithAnnonymusImplementation obj = new ThreadsWithAnnonymusImplementation();
		//Anonymous Implementation of Thread class
		Thread t = new Thread() {
			public void run()
			{
				System.out.println("run() method - logic 1");
			}
		};
		t.start();
		
		//Anonymous Implementation of Runnable Interface, Runnable is a s functional interface we cannot create object of it
		
		Runnable r = new Runnable() {
			
			public void run()
			{
				System.out.println("run() - logic 2");
			}
		};
		Thread t2 =new Thread(r);
		t2.start();
		
		//Anonymous Implementation of callable Interface
		
		Callable c = new Callable(){
			public Object call() throws Exception{
				System.out.println("Call() logic-3");
				return "hi";
			}
		};
		
		ExecutorService exService = Executors.newFixedThreadPool(1);
		exService.submit(c);
	}

}
