package designPrinciple.openClose;

/*
*  不要修改基础接口
*  开发打折功能不能在接口中添加打折方法
*  因为这样会波及到所有实现这个接口的方法
* */
public interface ICourse {
    int getId();
    String getName();
    double getPrice();
}
