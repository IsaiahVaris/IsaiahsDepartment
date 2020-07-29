public class ApplicantTest {
    Course course1 = new Course("Phy1");
    Course course2 = new Course("Phy2");
    Course course3 = new Course("Phy3");
    Course notOneOfcourses = new Course("NotPhy");
    Course[] courseList = new Course[]{course1, course2, course3};

    Class year1 = new Class("year1", 18, courseList);


}
