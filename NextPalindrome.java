public class NextPalindrome {
    public static void main(String[] args) {
        int arr [] ={9,4,1,8,7,9,8,3,2,2};

        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum*10+arr[i];
        }
        System.out.print(sum);
        
    }
    
}
