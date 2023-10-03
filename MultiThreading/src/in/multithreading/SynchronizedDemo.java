package in.multithreading;

public class SynchronizedDemo implements Runnable{
	//Not Synchronized Method
	public void printNum()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" ->"+ i);
			try
			{
				Thread.sleep(1000);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	//Synchronized Method
	public synchronized void printNumber()
	{
		for(int i=10;i>0;i--)
		{
			System.out.println(Thread.currentThread().getName()+" ->"+ i);
			try
			{
				Thread.sleep(1000);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		//Synchronized Block
		/*synchronized(this)
		{
			for(int i=10;i>0;i--)
			{
				System.out.println(Thread.currentThread().getName()+" ->"+ i);
				try
				{
					Thread.sleep(1000);
				}catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}*/
	}
	
	public void run()
	{
		printNum(); //calling unsynchronized Method
		printNumber(); // calling synchronized method
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchronizedDemo sd = new SynchronizedDemo();
		
		Thread t= new Thread(sd);
		t.start();
		
		Thread t1= new Thread(sd);
		t1.start();
		
		

	}

}
