import java.util.*;
public class BusSeating {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of Seat in Bus: ");
        int n = input.nextInt();
        int fre[] = new int  [n];
        
        while(true){
            System.out.print("Enter the seat number or -1 to stop: ");
            int seat = input.nextInt();
            if(seat==-1){
                break;
            }
            if(seat<0 || seat>=n){
                System.out.println("Invalid Seat Number");
                continue;
            }
            if(fre[seat]==0){
                System.out.println(seat+" Seat Booked");
                fre[seat]=1;
            }
            else{
                System.out.println(seat+" Seat Already Booked");
            }
        }
        System.out.println("Available Seats:");
        for(int i=0;i<n;i++){
            if(fre[i]==0){
                System.out.println("Seat is Available at "+i);
            }
        }
        System.out.println("Booked Seats:");
        for(int i=0;i<n;i++){
            if(fre[i]==1){
                System.out.println("Seat is Booked at "+i);
            }
        }
    }
    
}
