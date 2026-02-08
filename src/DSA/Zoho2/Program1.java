package DSA.Zoho2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program1 {


    public static void main(String[] args) {
        String str1="character12chca21char343";
        String str="12321231212312412125487307459023009";
        int num[]=new int[10];
        int characters[]=new int[26];
        int len=str.length();
        Arrays.fill(characters,-1);
        for(int i=0;i<len;i++){
            char ch=str.charAt(i);
            if(ch>='a'&&ch<='z'&&characters[ch-'a']==-1){
                characters[ch-'a']=i;
            }
            else if(ch>='0'&&ch<='9'){
                num[ch-'0']=i;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<len;i++){
            char ch=str.charAt(i);
            if(ch>='a'&&ch<='z'&&characters[ch-'a']==i){
                sb.append(ch);
            }
            else if(ch<='9'&&ch>='0'&&num[ch-'0']==i){
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }

}


//Remove duplicate elements in a string
//But character are in first occurrence
//Numericals are in their last occurrence