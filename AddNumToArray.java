public class AddNumToArray {
    public static void main(String[] args) {
        
        int arr [] ={9,9,9};
        int n=arr.length;

        int sum=0;

        for(int i=0;i<n;i++){
            sum=sum*10+arr[i];
        }

        sum=sum+1;
        int res [] = new int [n+1];
        for(int i=0;i<res.length;i++){
            res[i]=sum%10;
            sum=sum/10;
        }    
        for(int i=res.length-1;i>=0;i--){
            if(res[res.length-1]==0){
                continue;
            }
            System.out.print(res[i]);
        }
    }
    
}
