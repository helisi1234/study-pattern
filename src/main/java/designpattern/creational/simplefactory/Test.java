package designpattern.creational.simplefactory;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
//      v1.0 没有使用设计模式，继承抽象方法。应用层想使用需要知道
//      要实例化的类是什么，如果实例化的类不在同一个包下面，还需要导入
        Video video = new JavaVideo();
        video.produce();

//      v2.0 使用简单工厂，应用层只需要导入工厂类，在工厂类中导入
//      实例化的类即可
        VideoFactory videoFactory = new VideoFactory();
        Video pythonVideo = videoFactory.getVideo("python");
        if(pythonVideo == null) {
            return;
        }
        pythonVideo.produce();

//      v3.0 使用反射优化的简单工厂
        VideoFactory videoFactory1 = new VideoFactory();
        Video video1 = videoFactory1.getVideoReflact(JavaVideo.class);
        if(video1 == null) {
            return;
        }
        video1.produce();


    }
}
