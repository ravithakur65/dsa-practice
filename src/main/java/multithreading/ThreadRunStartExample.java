package multithreading;

public class ThreadRunStartExample {


    public static void main(String[] args) {
        ThreadClass thread = new ThreadClass();
        thread.run();
        System.out.println(thread.getName());
        thread.start();
        System.out.println(thread.getName());

    }
}

class ThreadClass extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println(this.getName() + " Thread class is running !!");
    }
}
