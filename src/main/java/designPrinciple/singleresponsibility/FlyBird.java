package designPrinciple.singleresponsibility;

//遵守单一职责，将不同移动方式的鸟区分开
public class FlyBird {
    public void moveMode(String birdName) {
        System.out.println(birdName + "用翅膀飞");
    }
}
