import java.util.ArrayList;

public class Principal extends Staff {

    Principal(String name) {
        super(name);
        setJobTitle("Principal");
    }

    public ArrayList<Student> listOfStudents = new ArrayList<Student>();
    public void addStudent(Student student) {
        listOfStudents.add(student);
    }
    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    @Override
    String jobDescription() {
        return "Oversees the running of the department";

    }

    //Check if student meets age criteria for class applied to
    public boolean admitStudent(Applicant applicant) {
        if (applicant.getAge() >= applicant.getClassAppliedTo().getRequiredAge()) {
            new Student(applicant.getName(), applicant.getId(), applicant.getClassAppliedTo());
            return true;
        }
        System.out.println("Applicant does not meet the requirement for admission");
        return false;
    }



    //check if student is actually a student before expelling
    public boolean expel(Student student) {
        if (getListOfStudents().contains(student)) {
            getListOfStudents().remove(student);
            return true;
        }
        return false;
    }
}
