package designpattern.creational.factorymethod;

public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new PythonVideoFactory();
        Video pythonVideo = videoFactory.getVideo();
        pythonVideo.getProduct();

        VideoFactory2 videoFactory2 = new JavaVideoFactory();
        Video JavaVideo = videoFactory2.getVideo();
        JavaVideo.getProduct();
    }
}
