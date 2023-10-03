package in.multithreading;

public class RunnableInterfaceDemo implements Runnable {

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
