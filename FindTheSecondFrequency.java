public class FindTheSecondFrequency {
    public static void main(String[] args) {
        String str ="aaall";
        int [] freq = new int [26];

        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }

        int max1=0;
        int max2=0;
        char ch1=' ';   
        char ch2=' ';

        for(int i=0;i<freq.length;i++){
            if(freq[i]>max1){
                max2=max1;
                max1=freq[i];
                ch1 = (char)(i+'a');

            }
            else if(freq[i]>max2 && freq[i]!=max1){
                max2=freq[i];
                ch2 = (char)(i+'a');
            }
        }
        System.out.println(ch1+" "+max1);
        System.out.println(ch2+" "+max2);
    }
}