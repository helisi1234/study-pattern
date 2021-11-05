package designPrinciple.singleresponsibility;

public class Main {
    public static void main(String[] args) {
//        v1.0
//        Bird bird = new Bird();
//        bird.moveMode("大雁");
//        bird.moveMode("鸵鸟");

//        v2.0 在应用层判断，不同的鸟类实例化不同实现类
        FlyBird flyBird = new FlyBird();
        flyBird.moveMode("大雁");
        WalkBird walkBird = new WalkBird();
        walkBird.moveMode("鸵鸟");
    }
}
