package multithreading;

public class PrintOddEven {
    static int currentNumber = 1;
    private final static int maxNumber = 100;
    private final static Object lock = new Object();
    public static void main(String[] args) {
        Thread oddThread = new Thread(() -> {
           synchronized (lock) {
               try {
                   while (currentNumber <= maxNumber) {
                       if(currentNumber % 2 ==0) {
                           lock.wait();
                       } else {
                           System.out.println("odd - "+ currentNumber);
                           currentNumber++;
                           lock.notify();
                       }
                   }
               }catch (InterruptedException ex){
                   Thread.currentThread().interrupt();
                   System.out.println("Odd Thread Interrupted");
               }
           }
        }, "Odd_Thread");

        Thread evenThread = new Thread(() -> {
            synchronized (lock) {
                try {
                    while (currentNumber <= maxNumber) {
                        if(currentNumber % 2 !=0) {
                            lock.wait();
                        } else {
                            System.out.println("even - "+ currentNumber);
                            currentNumber++;
                            lock.notify();
                        }
                    }
                }catch (InterruptedException ex){
                    Thread.currentThread().interrupt();
                    System.out.println("Even Thread Interrupted");
                }
            }
        }, "Even_Thread");

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
            Thread.currentThread().interrupt();
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            System.out.println("Main Thread Interuppted");
        }
    }
}
