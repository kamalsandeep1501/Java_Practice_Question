import java.util.*;
public class KReverseQueue {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
        int k=3;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<k;i++){
            st.push(arr[i]);
        }
        for(int i=0;i<k;i++){
            arr[i]=st.pop();
        }
        System.out.println(Arrays.toString(arr));
    }
}