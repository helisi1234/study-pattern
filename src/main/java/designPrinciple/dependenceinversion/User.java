package designPrinciple.dependenceinversion;

public class User {
    //v1
    //这种实现方式如果添加学习课程只能修改这个类不停添加或删除
    //test是最上层的应用，但test类完全依赖对底层user的修改
//    public void studyJavaCourse() {
//        System.out.println("学习Java课程");
//    }
//    public void studyPythonCourse() {
//        System.out.println("学习Python课程");
//    }

    //v2
//    public void studyCourse(ICourse iCourse) {
//        iCourse.studyCourse();
//    }

    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse() {
        iCourse.studyCourse();
    }
}
