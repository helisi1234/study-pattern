package designPrinciple.demeter;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {
    public void checkNumberOfCourse(List<Course> courseList) {
        System.out.println("在线课程数量是:" + courseList.size());
    }

    public void checkNumberOfCourse2() {
        List<Course> courseList = new ArrayList<Course>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("在线课程数量是:" + courseList.size());
    }
}
