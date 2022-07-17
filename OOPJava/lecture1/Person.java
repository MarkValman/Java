package lecture1;

public class Person {
    protected int id;
    protected String name;

    //Constructor
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and Setters
    public int get_id() {
        return this.id;
    }

    public String get_name() {
        return this.name;
    }
}
