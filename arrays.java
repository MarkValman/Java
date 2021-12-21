import java.util.spi.CalendarDataProvider;

public class arrays {
    public static void main(String[] args) {


        String[] cars = new String[3];
        cars[0] = "Mustang";
        cars[1] = "Corvete";
        cars[2] = "Mashina";

        // String[] cars = {"Lada", "Porshe", "Tesla"};

        // cars[0] = "Mustang";

        for(int i=0; i<cars.length; i++) {
            System.out.println(cars[i]);
        }

    }
}
