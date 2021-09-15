import java.util.*;

public class Pattern13 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        // handle rows
        for (int i = 0; i < n; i++) {
            int val = 1;
            // handle columns
            for (int j = 0; j <= i; j++) {
                // System.out.print("(" + i + "-->" + j + ") ");

                // print val
                System.out.print(val + "\t");
                // update val
                val = val * (i - j) / (j + 1);
            }
            // enter
            System.out.println();
        }

    }

}