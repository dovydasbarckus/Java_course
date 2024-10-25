package ThreadTesting;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread().getName());
        MyThread thread1 = new MyThread();
        thread1.setName("Thread #1");

        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);
        thread2.setName("Thread #2");

        MyRunnable runnable2 = new MyRunnable();
        Thread thread3 = new Thread(runnable2);



//        thread1.start();
//        thread2.start();
//        System.out.println(Thread.activeCount());

        thread1.start();
        thread1.join(3000);
        thread2.start();
        thread2.join(1000);
        thread3.setDaemon(true);
        thread3.start();
    }
}
