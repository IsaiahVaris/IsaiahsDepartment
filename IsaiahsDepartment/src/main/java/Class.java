import java.util.ArrayList;

public class Class {
    private String className;
    private int requiredAge;
    private ArrayList<Course> coursesTaken;

    public Class(String className, int requiredAge, ArrayList<Course> coursesTaken) {
        this.className = className;
        this.requiredAge = requiredAge;
        this.coursesTaken = coursesTaken;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getRequiredAge() {
        return requiredAge;
    }

    public void setRequiredAge(int requiredAge) {
        this.requiredAge = requiredAge;
    }

    public ArrayList<Course> getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(ArrayList<Course> coursesTaken) {
        this.coursesTaken = coursesTaken;
    }
}
