import java.util.ArrayList;

public class Student extends Person {
    private int age;
    private Class studentClass;
    Student student;



    public Student(String name, int age, Class studentClass) {
        super(name);
        this.age = age;
        this.studentClass = studentClass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1) {
            return;
        }
        this.age = age;
    }

    public Class getStudentClass() {
        return studentClass;
    }

    public String setStudentClass(Class studentClass) {
        if (age < studentClass.getRequiredAge()) {
            return "Student cannot be a member of this class";
        }
        this.studentClass = studentClass;
        return "Student is now a member of " + studentClass.getClassName();

    }

    public String takeCourse(Course course) {
        boolean canTakeCourse = false;
        //Student can take a course only if that course is part of the list of courses taken by student's class
        for (int i = 0; i < getStudentClass().getCoursesTaken().length && !canTakeCourse; i++) {
            if (course.equals(getStudentClass().getCoursesTaken()[i])) {
                canTakeCourse = true;
            }
        }
        if (canTakeCourse) {
            return "Student can take this course";
        } else {
            return "Student can't take this course";
        }
    }




}

