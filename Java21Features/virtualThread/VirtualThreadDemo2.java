package virtualThread;

public class VirtualThreadDemo2 {
    /***
     * If you want virtualthread to run before the JVM exit the application,
     * you can use the following code to keep the main thread alive until the virtual thread is done.
     */
    void main() throws InterruptedException {

    Thread t1 = Thread.ofVirtual().name("Virtual Thread 1").start(() -> {
        System.out.println("Hello from inside virtual thread!");
    });

    IO.println("Virtual thread started: " + t1.getName());
    IO.println("Waiting for virtual thread to finish...");
    t1.join(); // Wait for the virtual thread to finish
    IO.println("Main Thread finished: " + Thread.currentThread().getName());
}
    /***
     * Console Output : Virtual thread started: Virtual Thread 1
     * Waiting for virtual thread to finish...
     * Hello from inside virtual thread!
     * Main Thread finished: main
     */
}
