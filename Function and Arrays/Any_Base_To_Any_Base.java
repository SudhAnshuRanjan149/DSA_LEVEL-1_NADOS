import java.util.*;

public class Any_Base_To_Any_Base {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        scn.close();

        int InDecimal = anyBaseToDecimal(n, sourceBase); // call any base to decimal function
        int InDestBase = decimalToAnyBase(InDecimal, destBase); // call decimal to any base func

        System.out.println(InDestBase); // print result
    }

    public static int anyBaseToDecimal(int n, int b) {

        int dn = 0; // decimal number
        int bp = 1; // base power --> b^0 = 1;

        // this loop will execute till n is not equal to 0
        while (n > 0) {
            int rem = n % 10; // calculate remainder
            n /= 10; // reduce number

            dn += rem * bp; // update required number
            bp *= b; // update base power
        }
        return dn; // return result
    }

    public static int decimalToAnyBase(int n, int b) {

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
