package pizza_project;

public class main {

    public static void main(String[] args) {

        pizza Pizza = new pizza("Dominos bread", "Ketchunes", "Rokford", "Tuna");

        System.out.println("Lets take a look at your pizza");
        System.out.println(Pizza.bread);
        System.out.println(Pizza.sauce);
        System.out.println(Pizza.cheese);
        System.out.println(Pizza.topping);

    }
    
}
