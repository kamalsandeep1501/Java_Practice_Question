public class ArraySumOfDigit {
    public static void main(String[] args) {
        int [] arr={43,345,20,989};
        int res [] = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            int sum=0;
            int num=arr[i];
            while(num>0){
                int rem = num%10;
                sum+=rem;
                num=num/10;
            }
            res[i]=sum;
        }
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
