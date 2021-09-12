import java.util.*;

public class Pattern6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // write ur code here

        int nstars = n / 2 + 1;
        int nspaces = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nstars; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= nspaces; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= nstars; j++) {
                System.out.print("*\t");
            }
            System.out.println();

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
