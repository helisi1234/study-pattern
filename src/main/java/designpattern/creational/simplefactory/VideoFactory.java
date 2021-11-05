package designpattern.creational.simplefactory;

import java.sql.DriverManager;

public class VideoFactory {
    public Video getVideo(String type) {
        if("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if ("python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        return null;
    }

//  使用反射演进，优点是不再需要修改工厂类代码，只要实现类继承了抽象方法
//  就可以使用工厂类实例化
    public Video getVideoReflact(Class c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
