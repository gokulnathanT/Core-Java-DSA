package DSA.Zoho2;

import java.util.Arrays;

public class Program26 {
    public static void main(String[] args) {
        String str1="ABCDXYODKDSJ";
        String str2="ABCXYDSOBJE";

        int l1=str1.length();
        int l2=str2.length();
        int sub[][]=new int [l1+1][l2+1];
        int prev[]=new int[l2+1];
        int curr[]=new int[l2+1];
        int maxLen=0;
        for(int i=1;i<=l1;i++){
            for(int j=1;j<=l2;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    curr[j]=prev[j-1]+1;
                    maxLen=Math.max(maxLen,curr[j]);
                }
                else{
                    curr[j]=Math.max(prev[j],curr[j-1]);
                }
            }
            prev=curr;
        }
        System.out.println(maxLen);
    }

}
