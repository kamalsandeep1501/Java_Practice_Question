public class CountRabbitsAndChiken {
    public static void main(String[] args) {
        int leg=40;
        int head=15;
        int x;
        int y;

        int rabbit=0;
        int chicken=0;

        for(int i=1;i<=head;i++){
            x=i;
            y=head-i;
            if(4*x+2*y==leg){
                rabbit=x;
                chicken=y;
            }
        }
        System.out.println("Rabbits: " + rabbit);
        System.out.println("Chickens: " + chicken);

    }
    
}
