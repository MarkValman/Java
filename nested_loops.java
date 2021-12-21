import java.util.Scanner;

public class nested_loops {
        public static void main(String[] args) { 

            Scanner loops = new Scanner(System.in);
            int rows;
            int columns;
            String symbol = "";

            System.out.println("Enter num of rows: ");
            rows = loops.nextInt();
            System.out.println("Enter num of columns: ");
            columns = loops.nextInt();
            System.out.println("Enter a symbol: ");
            symbol = loops.next();

            for(int i=1; i<=rows; i++) {
                System.out.println();
                for(int j=1; j<=columns; j++) {
                    System.out.println(symbol);
                } 
            }


        }
}
