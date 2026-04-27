import java.util.*;
public class encode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str =input.next();
        Stack<String> st = new Stack<>();
        for(char ch:str.toCharArray()){
            if(ch==']'){
                String sb="";
                while(!st.isEmpty() && !st.peek().equals("[")){
                    sb=st.pop()+sb;
                }
                st.pop();
                String n="";
                while(!st.isEmpty() && Character.isDigit(st.peek().charAt(0))){
                    n=st.pop()+n;
                }
                int num = Integer.parseInt(n);
                StringBuilder sbb = new StringBuilder();
                while(num>0){
                    sbb.append(sb);
                    num--;
                }
                st.push(sbb.toString());
            }
            else{
                st.push(Character.toString(ch));
            }
        }

        String res ="";
        while(!st.isEmpty()){
            res=st.pop()+res;
        }
        System.out.println(res);
    }
    
}
