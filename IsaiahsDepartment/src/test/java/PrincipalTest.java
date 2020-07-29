import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrincipalTest {
    Principal principal = new Principal("C. N.");

    Course course1 = new Course("Phy1");
    Course course2 = new Course("Phy2");
    Course course3 = new Course("Phy3");
    Course notOneOfcourses = new Course("NotPhy");
    Course[] courseList = new Course[]{course1, course2, course3};

    Class year1 = new Class("year1", 18, courseList);
    Applicant johnny = new Applicant("Johnny", 17, year1);
    Student jane = new Student("Jane", 18, year1);

    @Test
    void testSetName() {
        assertFalse(principal.setName("C"), "Name should be a valid name of at least initials.");
    }

    @Test
    void testAdmit() {
        assertFalse(principal.admitStudent(johnny), "Applicant shouldn't be admitted if not up to required age");
    }


}
