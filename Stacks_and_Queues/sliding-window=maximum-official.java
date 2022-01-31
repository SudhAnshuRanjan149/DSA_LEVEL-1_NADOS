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
    int k = Integer.parseInt(br.readLine());

    // code
    int [] ngeidx = new int[a.length];
    Stack<Integer> st = new Stack<>();
    
    ngeidx[a.length-1] = a.length;
    st.push(a.length -1);
    
    for(int i = a.length - 2; i >= 0; i--){
        while(st.size() > 0 && a[i] >= a[st.peek()]){
            st.pop();
        } 
        
        if(st.size() == 0){
            ngeidx[i] = a.length;
        }else{
            ngeidx[i] = st.peek();
        }
        
        st.push(i);
    }
    
    
    // for(int i = 0;i<ngeidx.length;i++){
    //     System.out.print(ngeidx[i]+" ");
    // }
    
    int [] ans = new int[a.length - k + 1];
    
    for(int i = 0;i<ngeidx.length - k + 1;i++){
        // System.out.print(ngeidx[i]+" ");
        
        for(int j = i; j < i + k; j++){
            if(ngeidx[j] > (i + k - 1)){
                ans[i] = a[j];
                break;
            }
        }
    }
    
    for(int i = 0;i<ans.length;i++){
        // System.out.print(ans[i]+" ");
        System.out.println(ans[i]);
    }
 }
}
