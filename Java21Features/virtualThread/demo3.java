package virtualThread;

import java.util.concurrent.Callable;

public class demo3 {

    void main(){
        Callable<String> callable = () -> {
            Thread.sleep(1000);
            return "Hello from inside Callable thread!";
        };

        Thread t1 = new Thread((Runnable) callable);
        t1.start();

    }
}
