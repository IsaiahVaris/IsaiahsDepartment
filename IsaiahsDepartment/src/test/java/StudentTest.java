import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    Course course1 = new Course("Phy1");
    Course course2 = new Course("Phy2");
    Course course3 = new Course("Phy3");
    Course notOneOfcourses = new Course("NotPhy");
    ArrayList<Course> courseList = new ArrayList<>(Arrays.asList(course1, course2, course3));

    Class year1 = new Class("year1", 18, courseList);
    Student johnny = new Student("Johnny", 17, year1);
    Student jane = new Student("Jane", 18, year1);

    @Test
    void testSetStudentClass() {
        String expected = "Student cannot be a member of this class";
        String actual = johnny.setStudentClass(johnny.getStudentClass());
        assertEquals(expected, actual, "student has to meet the required class age.");
    }

    @Test
    void testTakeCourse() {
        String expected = "Student can't take this course";
        String actual = jane.takeCourse(notOneOfcourses);
        assertEquals(expected, actual, "student shouldn't be able to take courses outside of his/her class.");
    }

}
