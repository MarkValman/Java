package object_passing;

public class garage {


    static void park(bike bike) {
        System.out.println("The " + bike.name + "is parked in the garage");

    }

    static void park2(bike bike) {
        System.out.println("Ok, looks like " + bike.name + "parking near AMPM today");
    }

    static void park3(bike bike) {
        System.out.println("Zheka have " + bike.name + bike.colour);
    }

    static void park4(bike bike) {
        System.out.println("Mark have " + bike.name + bike.colour);
    }
    
}
