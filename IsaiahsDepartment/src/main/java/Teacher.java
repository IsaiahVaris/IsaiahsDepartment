import java.util.ArrayList;

public class Teacher extends Staff {
    private ArrayList<Course> coursesTaught;

    public Teacher(String name, ArrayList<Course> coursesTaught) {
        super(name);
        this.coursesTaught = coursesTaught;
        setJobTitle("Teacher");
    }

    public ArrayList<Course> getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(ArrayList<Course> coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    public String getListOfCoursesTaught() {
        String s = "";
        for (int i = 0; i < coursesTaught.size(); i++) {
            if (i == coursesTaught.size() - 1) {
                s += "and " + coursesTaught.get(i).getCourseName() + ".";
            } else {
                s += coursesTaught.get(i).getCourseName() + ", ";
            }
        }
        return getName() + " teaches " + s;
    }

    @Override
    String jobDescription() {
        return "Teaches in the department";
    }

    public String teachCourse (Course course) {
        boolean canTeachCourse = false;
        //Teacher can teach a course only if that course is part of the list of courses he/she is authorised to teach
        for (int i = 0; i < getCoursesTaught().size() && !canTeachCourse; i++) {
            if (course.equals(getCoursesTaught().get(i))) {
                canTeachCourse = true;
            }
        }
        if (canTeachCourse) {
            return "Teacher can teach this course";
        }
        return "Teacher can't teach this course";
    }
}
