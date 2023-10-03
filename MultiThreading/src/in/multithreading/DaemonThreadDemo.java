package in.multithreading;

public class DaemonThreadDemo implements Runnable {
	
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Is Daemon Thread");
		}
		else
		{
			System.out.println("Is a Normal Thread");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonThreadDemo dT = new DaemonThreadDemo();
		Thread t = new Thread(dT);
		t.setDaemon(true);
		t.start();
		
		Thread t1 = new Thread(dT);
		t1.start();
	}

}
