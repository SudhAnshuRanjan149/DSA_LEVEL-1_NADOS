package Day_1;
import java.util.*;

public class IsPrime {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // write ur code here
    int t = scn.nextInt();
    
    int count = 1;
    while (count <= t) {
      int n = scn.nextInt();
      isPrime(n);
      count++;
    }
    scn.close();
  }

  public static void isPrime(int n) {
    int count = 1;
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        count++;
      }
    }
    if (count >= 2) {
      System.out.println("not prime");
    } else {
      System.out.println("prime");
    }
  }
}
