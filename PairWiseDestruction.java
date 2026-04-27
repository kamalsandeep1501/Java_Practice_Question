
import java.util.Scanner;

class Node{
    String data;
    Node next;

    Node(String data){
        this.data=data;
        this.next=null;
    }
}
class Stack1{
    Node top=null;
    int size=0;
    
    public void push(String data){
        Node newnode = new Node(data);
        size++;
        if(top==null){
            top=newnode;
        }
        else{
            newnode.next=top;
            top=newnode;
        }
    }

    public void pop(){
        if(top==null){
            System.out.println("Empty");
            return;
        }
        else{
            //String data=top.data;
            top=top.next;
            size--;
            //return data;
        }
    }
    public boolean isEmpty(){
        return top==null;
    }
    public String peek(){
        if(top==null){
            System.out.println("Empty");
            return "";
        }
        else{
            return top.data;
        }
    }
    
    public void display() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }
        Node temp = top;
        System.out.print("Stack elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int size() {
        return size;
    }

}
public class PairWiseDestruction {
    public static int pair(String [] arr){
        if(arr.length==0){
            return 0;
        }
        Stack1 st = new Stack1();
        for(int i=0;i<arr.length;i++){
            if(st.isEmpty()){
                st.push(arr[i]);
            }
            else if(st.peek().equals(arr[i])){
                st.pop();
            }
            else{
                st.push(arr[i]);
            }
        }
        return st.size();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str=input.nextLine();
        String[] arr = str.split(" ");
        System.out.println(pair(arr));
    }
    
}

