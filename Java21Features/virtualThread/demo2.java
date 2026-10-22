package virtualThread;

public class demo2 {
    void main() throws InterruptedException {
        Runnable thread = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from runnable run method");
            }
        };

        Thread t1 =  new Thread(thread);
        t1.start();

        Thread t2 = new Thread(thread);
        t2.start();

        t1.join();
        t2.join();

        t1.sleep(100);

        System.out.println("Thread name: " + t1.getName());
        System.out.println("Thread state: " + t1.getState());
        System.out.println("Thread is alive: " + t1.isAlive());
        System.out.println("Thread is daemon: " + t1.isDaemon());
        System.out.println("Thread priority: " + t1.getPriority());
        System.out.println("END OF MAIN Thread " + Thread.currentThread().getName());


    }
}
