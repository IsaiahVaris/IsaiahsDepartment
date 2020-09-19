import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("Phy1");
        Course course2 = new Course("Phy2");
        Course course3 = new Course("Phy3");
        Course notOneOfcourses = new Course("NotPhy");

        ArrayList<Course> courseList = new ArrayList<>(Arrays.asList(course1, course3, course3));
        Teacher teacher = new Teacher("Billy", courseList);



    }
}
