public class Leader_Array {
    public static void main(String[] args) {
        int arr [] ={10,4,2,4,1};
        int n=arr.length;
        
        int lead=arr[n-1];
        System.out.println(lead);
        
        for(int i=n-2;i>=0;i--){
            if(lead<=arr[i]){
                System.out.println(arr[i]);
                lead=arr[i];
            }
        }
    
        // for(int i=0;i<n;i++){
        //     int lead=arr[i];
        //     boolean isLead=true;
        //     for(int j=i+1;j<n;j++){
        //         if(lead<arr[j]){
        //             isLead=false;
        //             break;
        //         }
        //     }
        //     if(isLead){
        //         System.out.println(lead);
        //     }
        // }

    }
    
}
