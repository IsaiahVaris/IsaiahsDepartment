abstract class Person {
    private String name;
    private int id;
    private static int count = 0;

    public Person(String name) {
        this.name = name;
        setId();
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if(name.length() < 2) {
            System.out.println("Invalid name");
            return false;
        }
        this.name = name;
        return true;
    }

    public int getId() {
        return id;
    }

    private void setId() {
        this.id = ++count;
    }
}
