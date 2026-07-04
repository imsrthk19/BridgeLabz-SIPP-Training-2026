class CourseType {
    String name;
    CourseType(String name) { this.name = name; }
}

class Course<T extends CourseType> {
    T course;

    Course(T course) {
        this.course = course;
    }

    void display() {
        System.out.println(course.name);
    }
}

public class CourseSystem {
    public static void main(String[] args) {

        CourseType c = new CourseType("Java OOP");

        Course<CourseType> course = new Course<>(c);

        course.display();
    }
}