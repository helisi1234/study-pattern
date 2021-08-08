package designPrinciple.openClose;

/*
*  继承需要打折的类
*  操作的值是需要打折的类的返回值这次改动只影响打折类不会影响其他类
*  而且可以实现复杂的打折计算
* */
public class JavaDiscountCourse extends JavaCourse{

    public JavaDiscountCourse(int cId, String cName, double cPrice) {
        super(cId, cName, cPrice);
    }

    public double getOriginPrice() {
        return super.getPrice();
    }

    public double getDiscountPrice() {
        double discountPrice = super.getPrice();
        //此处可以添加具体逻辑
        return discountPrice * 0.8;
    }
}
