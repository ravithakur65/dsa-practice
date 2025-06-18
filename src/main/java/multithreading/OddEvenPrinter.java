package multithreading;

public class OddEvenPrinter {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread oddThread = new Thread(() -> {
            try {
                printer.printOdd();
            }catch (InterruptedException ex){
                System.out.println("Odd thread Interrupted");
            }}, "Odd_thread");

        Thread evenThread = new Thread(() -> {
           try {
               printer.printEven();
           } catch (InterruptedException ex) {
               Thread.currentThread().interrupt();
               System.out.println("Even Thread Interrupted");
           }
        }, "even_thread");

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted");
        }
    }
}

class Printer {
    private int currentNumber = 1;
    private final int maxNumber = 100;
    private final Object lock = new Object();

    public void printOdd() throws InterruptedException {
        synchronized (lock) {
            while (currentNumber <= maxNumber) {
                if(currentNumber %2 == 0) {
                    lock.wait();
                }else {
                    System.out.println("odd - "+currentNumber);
                    currentNumber++;
                    lock.notify();
                }
            }
        }
    }

    public void printEven() throws InterruptedException {
        synchronized (lock) {
            while (currentNumber <= maxNumber) {
                if(currentNumber%2 != 0) {
                    lock.wait();
                }else {
                    System.out.println("even - "+currentNumber);
                    currentNumber++;
                    lock.notify();
                }
            }
        }
    }

}
