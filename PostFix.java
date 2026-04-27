import java.util.*;
public class PostFix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str=input.nextLine();
        String[] arr = str.split(" ");

        Stack1 st = new Stack1();

        for(String s:arr){
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int b = Integer.parseInt(st.peek());
                st.pop();
                int a = Integer.parseInt(st.peek());
                st.pop();
                int res=0;
                switch(s){
                    case "+":
                        res=a+b;
                        st.push(String.valueOf(res));
                        break;
                    case "-":
                        res=a-b;
                        st.push(String.valueOf(res));
                        break;
                    case "*":
                        res=a*b;
                        st.push(String.valueOf(res));
                        break;
                    case "/":
                        res=a/b;
                        st.push(String.valueOf(res));
                        break;
                }
            }
            else{
                st.push(s);
            }
        }
        System.out.println(st.peek());

    }
}
