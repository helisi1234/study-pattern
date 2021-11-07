package designpattern.creational.singleton;

public class LazySingletonDoubleCheck {
    private volatile static LazySingletonDoubleCheck lazySingletonDoubleCheck = null;
    private LazySingletonDoubleCheck() {

    }

    public static LazySingletonDoubleCheck getInstance() {
        if(lazySingletonDoubleCheck == null) {
            synchronized (LazySingletonDoubleCheck.class) {
                if(lazySingletonDoubleCheck == null) {
                    lazySingletonDoubleCheck = new LazySingletonDoubleCheck();
                }
            }
        }
        return lazySingletonDoubleCheck;
    }
}
