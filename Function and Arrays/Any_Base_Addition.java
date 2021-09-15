import java.util.*;

public class Any_Base_Addition {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        scn.close();

        int d = getSum(b, n1, n2); // call get sum function
        System.out.println(d); // print result
    }

    public static int getSum(int b, int num1, int num2) {
        // write ur code here
        int tp = 1; // power of ten
        int result = 0; // output number
        int rem = 0; // remainder
        int quo = 0; // quotient

        while (num1 != 0 || num2 != 0) {

            int n1 = num1 % 10; // find first place digit
            int n2 = num2 % 10; // find first place digit

            num1 /= 10; // reduce number
            num2 /= 10; // reduce number

            int sum = n1 + n2 + quo; // calculate sum , Quo == Carry

            rem = sum % b; // find remainder
            quo = sum / b; // find quotient

            result += tp * rem; // update result

            tp *= 10; // update power of ten

        }

        // check if quotient is zero or not
        if (quo != 0) {
            result += tp * quo; // if quo not equal to zero,then update result
        }

        return result;
    }
}
