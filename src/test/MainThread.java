package test;

class MyThreaddd implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " -> 1");
        System.out.println(Thread.currentThread().getName() + " -> 2");
        System.out.println(Thread.currentThread().getName() + " -> 3");
        System.out.println(Thread.currentThread().getName() + " -> 4");
        System.out.println(Thread.currentThread().getName() + " -> 5");
        System.out.println(Thread.currentThread().getName() + " -> 6");
        System.out.println(Thread.currentThread().getName() + " -> 7");
        System.out.println(Thread.currentThread().getName() + " -> 8");
        System.out.println(Thread.currentThread().getName() + " -> 9");
        System.out.println(Thread.currentThread().getName() + " -> 10");
    }
}

public class MainThread {
    public static void main(String[] args) {

        Thread t1 = new Thread(new MyThreaddd());
        Thread t2 = new Thread(new MyThreaddd());
        Thread t3 = new Thread(new MyThreaddd());
        Thread t4 = new Thread(new MyThreaddd());
        Thread t5 = new Thread(new MyThreaddd());
        Thread t6 = new Thread(new MyThreaddd());
        Thread t7 = new Thread(new MyThreaddd());
        Thread t8 = new Thread(new MyThreaddd());
        Thread t9 = new Thread(new MyThreaddd());
        Thread t10 = new Thread(new MyThreaddd());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }
}