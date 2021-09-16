import java.util.*;

public class Span_Of_Array {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // taking size of array

        int[] arr = new int[n]; // declare and define array

        // taking arrays inputs
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();

        // initate max and min
        int max = arr[0];
        int min = arr[0];

        // find max and min
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i]; // update max
            }
            if (min > arr[i]) {
                min = arr[i]; // update min
            }
        }

        int span = max - min; // calculate span
        System.out.println(span); // print span

    }

}