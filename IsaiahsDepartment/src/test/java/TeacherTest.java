import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeacherTest {

    Course course1 = new Course("Phy1");
    Course course2 = new Course("Phy2");
    Course course3 = new Course("Phy3");
    Course notOneOfcourses = new Course("NotPhy");
    ArrayList<Course> courseList = (ArrayList<Course>) Arrays.asList(new Course[]{course1, course2, course3});
    Teacher teacher = new Teacher("Billy", courseList);

    @Test
    void testTeachCourse() {
        String actual = teacher.teachCourse(notOneOfcourses);
        String expected = "Teacher can't teach this course";
        assertEquals("Teacher can't teach this course", actual, "Teacher should not be able to teach course out of course list");
    }

    @Test
    void testGetListOfCourses() {
        String actual = teacher.getListOfCoursesTaught();
        String expected = "Billy teaches Phy1, Phy2, and Phy3.";
        assertEquals(expected, actual, "Should return a string listing courses taught.");
    }

    @Test
    void testSetCourseTaught() {

        ArrayList<Course> courseList = new ArrayList<>(Arrays.asList(course1, course3));
        teacher.setCoursesTaught(courseList);

        String actual = teacher.getListOfCoursesTaught();
        String expected = "Billy teaches Phy1, and Phy3.";
        assertEquals(expected, actual, "Should return a string listing courses taught.");
    }


}
