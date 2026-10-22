package virtualThread;

public class VirtualThreadDemo4 {
/***Virtual thread are nameless by default,
 *  but you can give them a name using the Thread.ofVirtual().name() method.
 *  This can be useful for debugging and monitoring purposes. ***/


    void main() throws InterruptedException {
        Thread thread = Thread.startVirtualThread(() ->{
            IO.println("Hello from inside virtual thread!");
        });

        // No name will be printed for the virtual thread, as it is nameless by default
        IO.println("Virtual thread started: " + thread.getName());

        IO.println("Waiting for virtual thread to finish...");
        thread.join();


        IO.println("Main Thread finished: " + Thread.currentThread().getName());
    }
}
