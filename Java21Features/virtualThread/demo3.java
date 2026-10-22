package virtualThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class demo3 {

    void main() throws ExecutionException, InterruptedException {
        Callable<String> callable = () -> {
            Thread.sleep(1000);
            return "Hello from inside Callable thread!";
        };

        //Thread class doesn't have a constructor that takes a Callable, so we need to use ExecutorService to run the Callable in a virtual thread
        ExecutorService executorService = java.util.concurrent.Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(callable);
        IO.println(future.get());
        executorService.shutdown();
    }
}
