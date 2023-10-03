//Write a Java Program to get deadlock
package in.multithreading;

public class DeadLockDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		final String s1 ="h1";
		final String s2 ="hello";
	
		Thread t1 = new Thread() {
			public void run()
			{
				synchronized(s1)
				{
					System.out.println("Thread 1 locked resource 1");
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e)
					{
						e.printStackTrace();
					}
					//inside synchronized(s1) deadlock will occur
					synchronized(s2) {
						System.out.println("Thread 1 waiting for resource 2");
				        }
				}
				//outside synchronized(s1) deadlock will not occur
//				synchronized(s2) {
//					System.out.println("Thread 1 waiting for resource 2");
//			        }
			
			}
		};
		
		Thread t2 = new Thread()
		{
			public void run()
			{
				synchronized(s2) {
					System.out.println("Thread 2 locked resource 2");
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e)
					{
						e.printStackTrace();
					}
					synchronized(s1) {
						System.out.println("Thread 2 waiting for resource 1");
				        }
				}
//				synchronized(s1) {
//					System.out.println("Thread 2 waiting for resource 1");
//			        }
			}
	    };
	    t1.start();
	    t2.start();
	    

}
	}
