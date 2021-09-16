import java.util.*;

public class Any_Base_Subtraction {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt(); // given base
        int n1 = scn.nextInt(); // first number
        int n2 = scn.nextInt(); // second number
        scn.close();

        int d = getDifference(b, n1, n2); // call difference function
        System.out.println(d); // print result
    }

    public static int getDifference(int b, int n1, int n2) {

        int c = 0; // initiate borrow as 0
        int tp = 1; // power of ten --> used for collecting difference result
        int diff = 0; // initiate difference as 0

        // loop will run till greater number would remain greater than 0
        while (n2 > 0) {
            int d1 = n1 % 10; // find first unit place digit
            int d2 = n2 % 10; // find second unit place digit

            n1 = n1 / 10; // update/reduce first number
            n2 = n2 / 10; // update/reduce second number

            int d = d2 - c - d1; // calculating difference digit of d2, c and d1
            // if diff is les than 0
            if (d < 0) {
                c = 1; // update borrow as 1
                d = d + b; // update difference digit
            } else {
                c = 0; // update borrow as 0
            }

            diff += tp * d; // update difference result
            tp *= 10; // update power of ten
        }
        return diff; // return result
    }

}