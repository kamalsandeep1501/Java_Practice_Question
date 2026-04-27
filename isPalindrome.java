public class isPalindrome {
    public static void main(String [] args){
        int num=12321;
        int temp=num;
        int sum=0;
        while(temp>0){
            sum = sum*10 + temp%10;
            temp=temp/10;
        }
        if(num==sum){
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
    
}
