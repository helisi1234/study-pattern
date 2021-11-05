package designPrinciple.singleresponsibility;

public interface ICourseContent {
    String courseName();  // 获取课程名称
    byte[] courseVideo();  // 获取课程内容-二进制流
}
