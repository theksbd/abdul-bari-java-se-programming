// Method 1: Achieve Multithreading using Thread class
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + ". Hello");
        }
    }
}

// Method 2: Achieve Multithreading using Runnable interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + ". Hello");
        }
    }
}

public class ThreadPractice {
    public static void main(String[] args) {
//        // Usage of Method 1
//        MyThread myThread = new MyThread();
//        myThread.start();
//
//        for (int i = 0; i < 100; i++) {
//            System.out.println(i + ". World");
//        }

        // Usage of Method 2
        MyRunnable myRunnable = new MyRunnable();
        Thread t = new Thread(myRunnable);
        t.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(i + ". World");
        }
    }
}
