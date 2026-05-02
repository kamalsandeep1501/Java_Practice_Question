import java.util.*;
public class LongestCharArray {
    public static void main(String[] args) {
        String str="abcda";
        char ch[]=str.toCharArray();
        int max=0;
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    max=Math.max(max,j-i+1);
                }
            }
        }

        System.out.println(max);


    }
    
}
