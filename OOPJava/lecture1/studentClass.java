package lecture1;

// Extends means Student inheritade from Person
public class studentClass extends Person {
    // Atributes
    int age;
    String program;

    // Constructor
    studentClass(int id, String name) {
        super(id, name);

        this.id = 5;
        this.name = "zjpo";
    }

    // Methods
    void pay() {
        System.out.println("PAY!");
    }

    void examToday() {
        System.out.println("Exam today dude:D");
    }

    void print_details() {
        System.out.println("id - " + this.id + " name - " + this.name);
    }


    public static void main(String[] args)
    {
        studentClass Marko = new studentClass(342437853, "Marko Valmano");

        Marko.age = 23;
        Marko.program = "CS";
        Marko.pay();
        

        studentClass Zheka = new studentClass(343423423, "Zheka Nikola");

        Zheka.age = 23;
        Zheka.program = "CS";
        Zheka.examToday();


        Marko.print_details();
        Zheka.print_details();
    }

}
