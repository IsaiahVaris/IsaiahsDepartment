abstract class Staff extends Person {
    private String jobTitle;

    public Staff(String name) {
        super(name);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    //abstract method to be overriden by all staff children classes
    abstract String jobDescription();

}
