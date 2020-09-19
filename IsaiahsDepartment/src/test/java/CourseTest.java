import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CourseTest {
    Course course1 = new Course("Phy1");

    @Test
    void testSetCourseName() {
        Boolean actual = course1.setCourseName(" ");
        assertFalse(actual, "Course name has to be valid");
    }




}
