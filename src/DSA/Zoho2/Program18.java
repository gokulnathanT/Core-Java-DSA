package DSA.Zoho2;

public class Program18 {
    public static void main(String[] args) {
        String str1="AXXY";
        String str2="YADXCPXY";


        int l1=str1.length(),l2=str2.length();
        if(l1>l2) return;
        int i=0,j=0;
        while(i<l1&&j<l2){
            if(str1.charAt(i)==str2.charAt(j)){
                i++;

            }
            j++;
        }
        if(i==str1.length()){
            System.out.println("Subsequence");
        }
        else{
            System.out.println("Not a subsequence");
        }
    }
}
