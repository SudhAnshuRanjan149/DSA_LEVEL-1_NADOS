import java.util.*;

public class Pattern12 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        // initialize a,b and c variables
        int a = 0;
        int b = 1;
        int c = a + b;

        // handle rows
        for (int i = 1; i <= n; i++) {
            // handle columns
            for (int j = 0; j < i; j++) {
                // print a
                System.out.print(a + "\t");
                // update a,b,c
                a = b;
                b = c;
                c = a + b;
            }
            // enter
            System.out.println();
        }

    }
}