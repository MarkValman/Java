import java.util.Scanner;

/**
 * While loop
 */

public class study {
    public static void main(String[] args) {
        Scanner scaner_epta = new Scanner(System.in);
        String name = "";

        do{
            System.out.println("Enter your name: ");
            name = scaner_epta.nextLine();
        }while(name.isBlank());

        System.out.println("Hello " + name);
    }

}