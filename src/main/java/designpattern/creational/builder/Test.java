package designpattern.creational.builder;

public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseActualBuilder(courseBuilder);
        Course course = coach.makeCourse("Java课程","JavaPPT",
                "Java视频", "Java笔记", "Java问答");
        System.out.println(course.toString());
    }
}
