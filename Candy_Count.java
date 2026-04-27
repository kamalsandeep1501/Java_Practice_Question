public class Candy_Count {
    public static void main(String[] args) {
        int num=15;
        int amount=num;

        int temp=num;
        int count=0;

        while(temp>=3){
            int q=temp/3;
            int r=temp%3;
            amount+=q;
            temp=q+r;
        }
        System.out.println(amount);
      
    }

   
    }

