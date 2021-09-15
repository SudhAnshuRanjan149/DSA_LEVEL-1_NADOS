import java.util.*;

public class Pattern11 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        // initialize count variable
        int count = 1;

        // handle rows
        for (int i = 1; i <= n; i++) {
            // handle columns
            for (int j = 0; j < i; j++) {
                System.out.print(count + "\t");
                // update count
                count++;
            }
            // enter
            System.out.println();
        }

    }
}