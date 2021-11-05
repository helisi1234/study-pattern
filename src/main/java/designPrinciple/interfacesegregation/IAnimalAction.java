package designPrinciple.interfacesegregation;

/*
*  接口隔离原则指的是接口功能的分离
*  单一职责原则指的是接口职责的分离
*  游泳，吃，飞 要分成三个接口
*  游泳包含蛙泳、自由泳等 一个游泳接口可以包含多个游泳方法
* */
public interface IAnimalAction {
    void eat();
    void fly();
    void swim();
}
