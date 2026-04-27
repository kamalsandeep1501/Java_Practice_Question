public class CountSundayWithDay {
    public static void main(String[] args) {
        String days [] ={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int num=13;
        String day="Monday";
        int n=days.length;
        int index=0;
        for(int i=0;i<n;i++){
            if(days[i].equals(day)){
                index=i;
                break;
            }
        }
        int count=0;
        for(int i=index;i<=num+1;i++){
            if(days[i % n].equals("Sunday")){
                count++;
            }
        }
        System.out.println(count);
    }
}
    

