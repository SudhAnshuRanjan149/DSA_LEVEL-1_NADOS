import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner sc =  new Scanner(System.in);
    String str =  sc.nextLine();

    Stack <Character> st = new Stack<>();

    for (int i = 0; i < str.length(); i++ ) {
      if (str.charAt(i) == ')') {
        int count = 0;
        while (st.peek() != '(') {
          st.pop();
          count++;
        }
        if (count > 0) {
          st.pop();
        } else {
          System.out.println("true");
          return;
        }

      } else {
        st.push(str.charAt(i));
      }
    }
    System.out.println("false");
  }
}