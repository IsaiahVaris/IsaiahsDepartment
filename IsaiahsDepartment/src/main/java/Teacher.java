public class Teacher extends Staff {
    private Course[] coursesTaught;

    public Teacher(String name, Course[] coursesTaught) {
        super(name);
        this.coursesTaught = coursesTaught;
        setJobTitle("Teacher");
    }

    public Course[] getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(Course[] coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    public String getListOfCoursesTaught() {
        String s = "";
        for (int i = 0; i < coursesTaught.length; i++) {
            if (i == coursesTaught.length - 1) {
                s += "and " + coursesTaught[i].getCourseName() + ".";
            } else {
                s += coursesTaught[i].getCourseName() + ", ";
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
        for (int i = 0; i < getCoursesTaught().length && !canTeachCourse; i++) {
            if (course.equals(getCoursesTaught()[i])) {
                canTeachCourse = true;
            }
        }
        if (canTeachCourse) {
            return "Teacher can teach this course";
        }
        return "Teacher can't teach this course";

    }


}
