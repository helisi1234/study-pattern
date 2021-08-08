package designPrinciple.openClose;

/*
*  开闭原则
*  对扩展开放对修改关闭
*  对必须的值构建框架，对值的修改业务细节使用继承的方式实现
*  不能修改基础接口
* */
public class Test {

    public static void main(String[] args) {
//        ICourse javaCourse = new JavaCourse(1, "Java课程", 333.00);
//        System.out.println("JavaCourse[ Cid:" + javaCourse.getId() +
//                " Name:" + javaCourse.getName() + " Price:" + javaCourse.getPrice() + " ]");
        //添加打折功能
        ICourse iCourse = new JavaDiscountCourse(1, "Java课程", 333.00);
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse)iCourse;
        System.out.println("[ Cid:" + javaDiscountCourse.getId() +
                "\nName:" + javaDiscountCourse.getName() + "\nOrigin Price:" + javaDiscountCourse.getOriginPrice() +
                "\nDiscount Price:" + javaDiscountCourse.getDiscountPrice() + " ]");
    }
}
