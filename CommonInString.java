
import java.util.Set;

public class CommonInString {
    public static void main(String[] args) {
        String str1="apple";
        String str2="grape";
        
        Set<Character> set = new java.util.HashSet<>();
        for(int i=0;i<str1.length();i++){
            set.add(str1.charAt(i));
        }

        for(int i=0;i<str2.length();i++){
            if(set.contains(str2.charAt(i))){
                System.out.print(str2.charAt(i)+" ");
            }
        }

    }
    
}
