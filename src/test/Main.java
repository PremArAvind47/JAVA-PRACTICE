package test;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running...");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start(); // NOT run()
        MyThread t1 = new MyThread();
        t1.start(); // NOT run()
      
    }
    
}