void main() {
    System.out.println(Thread.currentThread().getName());

    //Manual creation of thread using Thread class and Runnable interface
    Thread t1 = new Thread(() ->
    {
        System.out.println("Hello from a manual thread!");
    });

    t1.start();
    System.out.println("Hello from the main thread!");
    System.out.println("Thread name: " + t1.getName());
    IO.println("Thread state: " + t1.getState());
    IO.println("Thread is alive: " + t1.isAlive());
    IO.println("Thread is daemon: " + t1.isDaemon());
    IO.println("Thread priority: " + t1.getPriority());
    IO.println("END OF MAIN Thread " + Thread.currentThread().getName());
}