import java.util.*;

public class Pattern4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // taking input
        int n = scn.nextInt();
        scn.close();
        // Initiate number of stars as well as number of spaces to be printed in first line
        int nstars = n;
        int nspaces = 0;

        // this loop executes for n times as we have to print n rows
        for (int i = 0; i < n; i++) {

            // System.out.println(nstars+ " "+ nspaces);
            // this loop prints required number of spaces in a row with a tab
            for (int j = 0; j < nspaces; j++) {
                System.out.print("\t");
            }

            // this loop prints required number of stars in a row with a tab
            for (int j = 0; j < nstars; j++) {
                System.out.print("*\t");
            }
            System.out.println();

            // update stars and spaces as per the requirement in next iteration
            nstars--;
            nspaces++;
        }

    }
}
