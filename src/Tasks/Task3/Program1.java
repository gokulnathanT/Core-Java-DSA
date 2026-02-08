package Tasks.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Program1 {

    static ExecutorService executorService= Executors.newFixedThreadPool(5);

    public static void main(String[] args) throws Exception {
        executorService.submit(()-> {
                System.out.println("hello");
        });
        executorService.submit(()-> {
            System.out.println("hello");
        });
        executorService.submit(()-> {
            System.out.println("hello");
        });
        executorService.submit(()-> {
            System.out.println("hello");
        });
        executorService.submit(()-> {
            System.out.println("hello");
        });

        executorService.execute(()->{
            System.out.println("hiii");
        });
        List<CustomCallable> tasks=new ArrayList<>();
        tasks.add(new CustomCallable(10));
        tasks.add(new CustomCallable(11));
        tasks.add(new CustomCallable(13));
        tasks.add(new CustomCallable(14));
        tasks.add(new CustomCallable(16));



        executorService.invokeAll(tasks);


        //        tasks.add(()->{
//            System.out.println("hello");
//            return 0;
//        });
//        tasks.add(()->{
//            System.out.println("hello");
//            return 0;
//        });
//        tasks.add(()->{
//            System.out.println("hello");
//            return 0;
//        });
    }
}
