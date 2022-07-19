package lecture3;
// import java.lang.reflect.Array;
// import java.util.ArrayList;
import java.util.Scanner;


public class roni {

    //get user input of number array
    public static int[] getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }


}