public class NextPalindrome {
    static boolean isPalindrome(long num){
        long temp=num;
        long sum=0;
        while(temp>0){
            sum = sum*10 + temp%10;
            temp=temp/10;
        }
        return num==sum;
    }
    public static void main(String[] args) {
        int arr [] ={9,4,1,8,7,9,8,3,2,2};

        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum*10+arr[i];
        }
        System.out.print(sum);
        long i=0;
        while(true){
            i++;
            if(isPalindrome(i)){
                if(i>sum){
                    System.out.println("Next palindrome is "+i);
                    break;
                }
            }
        }
        
    }
    
}
