
import java.util.*;
public class Rearrange_Array {
    public static void main(String[] args) {
        int arr [] ={1,2,3,-4,-1,4};

        int n=arr.length;
        int countNeg=0;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                countNeg++;
            }
        }
        int [] negArr = new int [countNeg];
        int [] posArr = new int [n-countNeg];

        int i=0,j=0;
        for(int k=0;k<n;k++){
            if(arr[k]<0){
                negArr[i++]=arr[k];
            }
            else{
                posArr[j++]=arr[k];
            }
        }
        System.err.println("Negative Array"+Arrays.toString(negArr));
        System.err.println("Positive Array"+Arrays.toString(posArr));
        
        int [] temp= new int [n];
        i=0;j=0;
        int k=0;
        while(i<negArr.length && j<posArr.length){
            temp[k++]=posArr[i++];
            temp[k++]=negArr[j++];
        }
        while(i<negArr.length){
            temp[k++]=negArr[i++];
        }
        while(j<posArr.length){
            temp[k++]=posArr[j++];
        }
        System.out.println("Rearranged Array"+Arrays.toString(temp));

        




    }
    
}
