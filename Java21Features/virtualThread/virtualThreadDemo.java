package virtualThread;

public class virtualThreadDemo {
 /***Virtual thread are lightweight threads that are managed by the Java Virtual Machine (JVM) rather than the operating system.
  They are designed to be more efficient and scalable than traditional threads, allowing for a large
  number of concurrent tasks to be executed without the overhead of creating and managing many OS-level threads.
  ** Virtual thread are daemon thread, which means they do not prevent the JVM from exiting when the main thread finishes execution.
  * So if the main thread finishes execution, the JVM will exit and any virtual threads that are still running will be terminated.
  * For below example, the main thread will finish execution before the virtual thread has a chance to complete its task,
  * so the virtual thread will be terminated and its output will not be printed to the console
  *
  * */
    void main() throws InterruptedException {
        IO.println("Main Thread : " + Thread.currentThread().getName());
        IO.println("Starting virtual thread demo...");
        Thread thread =  Thread.ofVirtual().name("Virtual Thread 1").start(() -> {
            System.out.println("Hello from inside virtual thread!");
        });
        IO.println("Virtual thread started: " + thread.getName());
        IO.println("Waiting for virtual thread to finish...");
        IO.println("Main Thread finished: " + Thread.currentThread().getName());
    }

    /***
     * Console Output : Main Thread : main
     * Starting virtual thread demo...
     * Hello from inside virtual thread!
     * Virtual thread started: Virtual Thread 1
     * Waiting for virtual thread to finish...
     * Main Thread finished: main
     */
}
