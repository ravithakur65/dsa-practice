import java.util.concurrent.*;

public class ThreadExecutorExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Runnable runnableThread = () -> System.out.println("Thread is running using Runnable ");
//        Thread thread = new Thread(runnableThread);
//        thread.start();
//        System.out.println("Thread name : "+thread.getName());
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(runnableThread);
//        executorService.shutdown();

        Callable<Integer> call = () ->  4;
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(call);
        System.out.println(future.get());
        executorService.shutdown();
        executor.shutdown();
    }
}
