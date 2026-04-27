import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            int rem = target-arr[i];

            if(set.contains(rem)){
                System.out.println("Pair Found: "+arr[i]+" "+rem);
            }
            set.add(arr[i]);
        }




    }
}
