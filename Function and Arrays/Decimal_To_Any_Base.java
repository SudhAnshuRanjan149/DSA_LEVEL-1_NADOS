import java.util.*;

public class Decimal_To_Any_Base {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt(); // given number
        int b = scn.nextInt(); // given base digit
        scn.close();

        int dn = getValueInBase(n, b); // calling required function
        System.out.println(dn); // print result
    }

    public static int getValueInBase(int n, int b) {

        int bn = 0; // Final Number on required base
        int tp = 1; // Power of ten(10) --> 10^0 = 1

        // loop will run till number not becomes equal to 0
        while (n > 0) {
            int rem = n % b; // calculate remainder
            n = n / b; // reduce number

            bn += tp * rem; // update required number
            tp *= 10; // update power of ten
        }
        return bn; // return final result

    }
}