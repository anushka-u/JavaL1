/*
 * In this example both thread is executing parallelly 
 * You can see that in output that our output isn't in serialize way
 * Our main thread is being completely executed and parallelly our userdefined thread is also being executed
 * That is why we are getting o/p as 
 * Main thread Started
  Main thread completed
  My Thread started
  I am run() method
  My thread ended

 */
package in.multithreading;

public class UserDefineThread extends Thread {

	public void run()
	{
		System.out.println("My Thread started");
		System.out.println("I am run() method");
		System.out.println("My thread ended");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread Started");
		UserDefineThread uds = new UserDefineThread();
		
		Thread t =new Thread(uds); //associating our object with thread
		t.start(); //internally it will call run method // userdefinethread will run
		
		System.out.println("Main thread completed");
		
	}

}
