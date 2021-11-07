package designpattern.creational.singleton;

/*
*  多线程不安全的懒汉式单例模式
* */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private LazySingleton() {

    }

    /*
    使用synchronized可以解决但性能差
    使用synchronized加在静态方法上
    public synchronized static LazySingleton getInstance() {
        if(lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
    使用synchronized加在类锁上
    public static LazySingleton getInstance() {
        synchronized(LazySingleton.class) {
            if(lazySingleton == null) {
                lazySingleton = new LazySingleton();
            }
        }
        return lazySingleton;
    }
    */

    public static LazySingleton getInstance() {
        if(lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
