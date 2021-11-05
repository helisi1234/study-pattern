package designpattern.creational.factorymethod;

public class JavaVideoFactory implements VideoFactory2{
    public Video getVideo() {
        return new JavaVideo();
    }
}
