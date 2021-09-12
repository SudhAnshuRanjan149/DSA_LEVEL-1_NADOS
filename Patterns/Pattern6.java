import java.util.*;

public class Pattern6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        
        // initialize nstars and nspaces
        int nstars = n / 2 + 1;
        int nspaces = 1;

        for (int i = 1; i <= n; i++) {
            // prints stars
            for (int j = 1; j <= nstars; j++) {
                System.out.print("*\t");
            }
            // print spaces
            for (int j = 1; j <= nspaces; j++) {
                System.out.print("\t");
            }
            // print stars
            for (int j = 1; j <= nstars; j++) {
                System.out.print("*\t");
            }
            // enter
            System.out.println();

            // update nstars and nspaces
            if (i <= n / 2) {
                nstars--;
                nspaces += 2;
            } else {
                nstars++;
                nspaces -= 2;
            }
        }

    }
}
