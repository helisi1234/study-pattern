package designPrinciple.dependenceinversion;

public class Test {
    public static void main(String[] args) {
        // v1
//        User user = new User();
//        user.studyJavaCourse();
//        user.studyPythonCourse();
        User user = new User();
        user.setiCourse(new JavaCourse());
        user.studyCourse();
    }
}
