package lecture3;

// //create main class
public class lec3Main {

            //print avverage of array numbers in main method
            public static void main(String[] args) {
                int[] arr = roni.getInput();
                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    sum += arr[i];
                }
                System.out.println("Average: " + (sum / arr.length));
            }
}


// public static void main(int[] arr) 
// {
//     int sum = 0;
//     for (int i = 0; i < arr.length; i++) {
//         sum += arr[i];
//     }
//     System.out.println("The average of the array is: " + sum / arr.length);
// }