import java.util.*;
public class FindFirstPositive {
    public static void main(String[] args) {
        int arr [] = {-8,0,-1,-4,-3};
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                min=Math.min(min, arr[i]);
                set.add(arr[i]);
            }
        }
        for(int i:set){
            if(set.contains(min+1)){
                min=min+1;
            }
            else{
                System.out.println("First Missing Positive Number "+(min+1));
                return;
            }
        }
    }
    
}
