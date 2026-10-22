package virtualThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThreadDemo3 {

    void main(String[] args) {
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();
        executor.execute(() -> {
            System.out.println("Hello from inside virtual thread!");
        });

        executor.submit(() ->{
            System.out.println("Hello from inside virtual thread using submit!");
            for(int i=0;i<5;i++){
                System.out.println("Count: " + i);
            }
            System.out.println("Virtual thread finished execution.");
        });

        try {
            Thread.sleep(1000); // Sleep for a while to let the virtual thread finish execution
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
