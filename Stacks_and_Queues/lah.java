import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    // code
    Stack<Integer> st = new Stack<>();
    for(int i = 0;i<a.length;i++){
        int l = lb(a,i);
        int r = rb(a,i);
        
        int area = a[i] * (r - l + 1);
        // System.out.println("area for "+ a[i]+" --> "+area);
        
        while(st.size() > 0 && st.peek() < area){
            st.pop();
        }
        
        if(st.size() == 0){
            st.push(area);
        }
    }
    
    System.out.println(st.peek());
    
 }
 
 public static int rb(int [] a,int idx){
    if(idx == a.length - 1){
        return idx;
    }
    int n = a[idx];
    for(int i = idx + 1; i < a.length; i++){
        if(n <= a[i]){
            
        }else{
            return i - 1;
        }
    }
    
    return a.length - 1;
 }
 public static int lb(int [] a,int idx){
    if(idx == 0){
        return 0;
    }
    int n = a[idx];
    for(int i = idx - 1; i >= 0; i--){
        if(n <= a[i]){
            
        }else{
            return i + 1;
        }
    }
    
    return 0;
 }
}
