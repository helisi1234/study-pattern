package designpattern.creational.singleton;

//饿汉式，占用内存空间
public class HungrySingleton {
    private final static HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton() {}
    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
