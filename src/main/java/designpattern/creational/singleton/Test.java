package designpattern.creational.singleton;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("program end");
    }
}
