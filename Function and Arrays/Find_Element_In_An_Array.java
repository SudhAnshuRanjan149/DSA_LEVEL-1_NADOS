import java.util.*;

public class Find_Element_In_An_Array {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // taking size of array

        int[] arr = new int[n]; // declare and define array

        // taking arrays inputs
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt(); // taking required digit that need to match in Array
        scn.close();

        int foundAt = -1; // intiating foundAt variable

        for (int i = 0; i < arr.length; i++) {
            // Matching required digit with each array's data
            if (arr[i] == d) {
                foundAt = i; // update foundAt if match found
                break; // break the loop
            }
        }

        System.out.println(foundAt); // print the result
    }
}
