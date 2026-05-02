import  java.util.*;
public class MoreThanTime {
    public static void main(String[] args) {
        int arr[] ={1,1,2,1,3,5,1};
        int n=arr.length;

        int k=n/2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>k){
                System.out.println(e.getKey());
                return;
            }
        }
        System.out.println(-1);
    }
}
