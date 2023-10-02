package in.multithreading;

public class MultiThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //To get main thread
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread);
		System.out.println(currentThread.getName());
		
		//we created this thread for demo
		Thread t =new Thread();
		String name = t.getName();
		System.out.println(name);
	}

}
