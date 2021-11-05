package designPrinciple.singleresponsibility;

public class Bird {
//  v1.0 没有遵守单一职责原则
    public void moveMode(String birdName) {
        /*
        *  1.使用if后必须提前返回或者将其余代码放在else代码块里，否则会全部执行
        *  2.使用"鸵鸟".equals(birdName)不会发生空指针异常
        *  3.这种实现方式受限传入参数的值，如果传入企鹅还需要再写一个if
        * */
        if("鸵鸟".equals(birdName)) {
            System.out.println(birdName + "用脚走");
        } else {
            System.out.println(birdName + "用翅膀飞");
        }
    }
}
