package in.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableDemo implements Callable {

	
	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Call()  method executed.......");
		return "hey";
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CallableDemo cD = new CallableDemo(); 
		/*
		 * When our class implements callable then our Thread cannot be created by
		 * using Thread, to create thread we need to use Executor.
		 * Because Thread class does not have constructor to take callable interface
		 */
//		ExecutorService exService = Executors.newFixedThreadPool(1);// It means one thread will be created, depends on the number we are passing in argument
		
		ExecutorService exService = Executors.newFixedThreadPool(10); // It created 10 thread
		for(int i=0;i<=20;i++)
		{
			exService.submit(cD);
		}
	
		exService.shutdown(); // To shutdown the exService
	}
	

}
