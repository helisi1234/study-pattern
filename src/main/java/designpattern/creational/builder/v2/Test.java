package designpattern.creational.builder.v2;

public class Test {
    public static void main(String[] args) {
//      使用静态内部类和链式调用
//      可以按需调用
        Course course = new Course.CourseBuilder().buildCourseName("Java")
                .buildCoursePPT("Java PPT").buildCourseVideo("Java Video")
                .buildCourseArticle("Java Article").build();
        System.out.println(course.toString());
    }
}
