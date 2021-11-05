package designPrinciple.singleresponsibility;

public interface ICourse {
//  根据单一职责原则，这两个功能需要分离

//  课程内容相关功能
    String courseName();  // 获取课程名称
    byte[] courseVideo();  // 获取课程内容-二进制流

//  课程管理相关功能
    void studyCourse();  // 学习课程
    void refundCourse();  // 退出课程
}
