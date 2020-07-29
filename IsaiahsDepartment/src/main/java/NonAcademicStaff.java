public class NonAcademicStaff extends Staff {

    public NonAcademicStaff(String name) {
        super(name);
        setJobTitle("Non-academic staff");
    }

    @Override
    String jobDescription() {
        return "Performs non-academic duties in the department";
    }
}
