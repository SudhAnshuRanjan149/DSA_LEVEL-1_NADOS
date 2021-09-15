import java.util.*;

public class Pattern10 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        // initialize outer and inner spaces
        int outerSpace = n / 2;
        int innerSpace = -1;

        for (int i = 1; i <= n; i++) {
            // print outerspaces
            for (int j = 1; j <= outerSpace; j++) {
                System.out.print("\t");
            }
            // print one star
            System.out.print("*\t");
            if (innerSpace > 0) {
                // print inner spaces
                for (int j = 1; j <= innerSpace; j++) {
                    System.out.print("\t");
                }
                // print one star
                System.out.print("*\t");
            }
            // enter
            System.out.println();

            // update inner and outer spaces
            if (i <= n / 2) {
                innerSpace += 2;
                outerSpace--;
            } else {
                innerSpace -= 2;
                outerSpace++;
            }

        }

    }
}