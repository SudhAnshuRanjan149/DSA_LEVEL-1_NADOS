import java.util.*;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // taking input
        int n = scn.nextInt();
        scn.close();
        // Initiate number of stars to be printed in first line
        int nstars = 1;

        // this loop executes for n times as we have to print n rows
        for (int i = 0; i < n; i++) {
            // this loop prints required number of stars in a row with a tab
            for (int j = 0; j < nstars; j++) {
                System.out.print("*\t");
            }
            System.out.println();

            // update stars,so we can increase stars in next iteration
            nstars++;
        }

    }
}