package designPrinciple.demeter;

import java.util.ArrayList;
import java.util.List;

/*
*  迪米特原则
*  最少知道原则，尽量用private或protect权限代替public权限
*  一个类只导入它的朋友类
*  朋友类：出现在参数中，出现在返回值中，出现在成员变量中
* */
public class Boss {

//  v1.0 没有使用迪米特原则，course与boss不是朋友类关系，这个方法之应该与teamleader相关
    public void commandCheckNumber(TeamLeader teamLeader) {
        List<Course> courseList = new ArrayList<Course>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        teamLeader.checkNumberOfCourse(courseList);
    }

//  v2.0
    public void commandCheckNumber2(TeamLeader teamLeader) {
        teamLeader.checkNumberOfCourse2();
    }
}
