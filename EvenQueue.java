
import java.util.*;
public class EvenQueue {
    public static void main(String[] args) {
        int [] arr ={2,4,3,1};
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            q.add(arr[i]);
        }
        int size = q.size()/2;

        Queue<Integer> q2 = new LinkedList<>();
        for(int i=0;i<size;i++){
            q2.add(q.poll());
        }
        System.out.println(q);
        System.out.println(q2);
        
        Queue<Integer> res = new LinkedList<>();
        while(!q.isEmpty()){
            res.add(q2.poll());
            res.add(q.poll());
        }
        System.out.println(res);
    }
    
}
