public class Course {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public boolean setCourseName(String courseName) {
        if (courseName.length() > 1) {
            this.courseName = courseName;
            return true;
        } else {
            System.out.println("Invalid course name");
            return false;
        }

    }
}
