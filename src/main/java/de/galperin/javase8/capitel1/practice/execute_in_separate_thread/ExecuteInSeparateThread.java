package de.galperin.javase8.capitel1.practice.execute_in_separate_thread;

public class ExecuteInSeparateThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread t1 = new Thread(new MyFlow());
        t1.start();
    }
}


class MyFlow implements Runnable {
    @Override
    public void run() {
        System.out.println("in run method..thread name is "+Thread.currentThread().getName());
    }
}

// learning about how to execute code in separate thread from
// main thread