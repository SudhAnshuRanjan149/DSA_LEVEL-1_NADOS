import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner sc =  new Scanner(System.in);

    String str = sc.nextLine();
    Stack <Character> st = new Stack<>();

    // System.out.println(str);

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i) == ']') {
        if (st.size() != 0) {
          if (str.charAt(i) == ')' && st.peek() == '(') {
            st.pop();
          } else if (str.charAt(i) == '}' && st.peek() == '{') {
            st.pop();
          } else if (str.charAt(i) == ']' && st.peek() == '[') {
            st.pop();
          } else {
            System.out.println(false);
            return;
          }
        } else {
          System.out.println(false);
          return;
        }
      } else if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
        st.push(str.charAt(i));
      }
    }

    if (st.size() > 0) {
      System.out.println(false);
    } else {
      System.out.println(true);
    }
  }

}
