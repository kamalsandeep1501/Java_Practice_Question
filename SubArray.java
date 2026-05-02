public class SubArray {
public static void main(String[] args) {
    int arr [] = {1,2,4,5,6};

    int n=arr.length;
    int curr=arr[0];
    int max=arr[0];

    for(int i=0;i<n;i++){
        curr=Math.max(arr[i],curr+arr[i]);
        max=Math.max(curr,max);
    }
    System.out.println(max);
 }
}