public class Applicant extends Person {
    private int age;
    private Class classAppliedTo;

    public Applicant(String name, int age, Class classAppliedTo) {
        super(name);
        this.age = age;
        this.classAppliedTo = classAppliedTo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Class getClassAppliedTo() {
        return classAppliedTo;
    }

    public void setClassAppliedTo(Class classAppliedTo) {
        this.classAppliedTo = classAppliedTo;
    }
}
