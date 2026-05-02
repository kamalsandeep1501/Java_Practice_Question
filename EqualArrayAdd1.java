
public class EqualArrayAdd1 {
    static int findmax(int arr[]){
        int max=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        return index;
    }
    static void addone(int arr[],int index){
        for(int i=0;i<arr.length;i++){
            if(i==index){
                continue;
            }
            else{
                arr[i]=arr[i]+1;
            }
        }
    }
    static boolean checkequal(int arr[]){
        int first=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=first){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr []={4,3,4};
        int n=arr.length;

        int count=0;
        while(!checkequal(arr)){
            int index=findmax(arr);
            addone(arr,index);
            count++;
        }
        
        System.out.println("Count "+count);
    }
    
}
