import java.util.*;

public class Any_Base_To_Decimal {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        scn.close();

        int d = getValueIndecimal(n, b); // call function
        System.out.println(d); // print result
    }

    public static int getValueIndecimal(int n, int b) {
       
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
}