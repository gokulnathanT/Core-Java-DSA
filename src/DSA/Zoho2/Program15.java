package DSA.Zoho2;

import java.util.Map;

public class Program15 {
    public static void main(String[] args) {
        String pattern="5D1F";
        StringBuilder sb=new StringBuilder();
        for(char ch:pattern.toCharArray()){
            int value;
            if(ch>='A'&&ch<='F'){
                 value=10+ch-'A';
            }
            else{
                value=ch-'0';
            }
            sb.append(convertIntoBinary(value));

        }
        System.out.println(sb.toString());
    }
    public static String convertIntoBinary(int value){
        StringBuilder sb=new StringBuilder();
        while(value!=0){
            if((value&1)==1){
                sb.insert(0,"1");
            }
            else{
                sb.insert(0,"0");
            }
            value>>=1;
        }
        while(sb.length()<4){
            sb.insert(0,"0");
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
