import java.util.*;

public class MaxDiff {

    public static void main(String[] args) {

        int[] arr = {2,4,8,7,7,9,3};

        int n = arr.length;

        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++) {

            while(!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }

            if(st.isEmpty())
                left[i] = 0;
            else
                left[i] = st.peek();

            st.push(arr[i]);
        } 
        st.clear();
        for(int i = n-1; i >= 0; i--) {

            while(!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }

            if(st.isEmpty())
                right[i] = 0;
            else
                right[i] = st.peek();

            st.push(arr[i]);
        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
    }
}