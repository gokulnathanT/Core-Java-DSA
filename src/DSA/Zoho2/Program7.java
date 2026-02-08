package DSA.Zoho2;

import java.util.HashSet;
import java.util.Set;

public class Program7 {
    public static void main(String[] args) {
        String input="aeiouaaexioyuuusdu";
        String pattern ="aeiou";
        System.out.println(input);
        System.out.println(pattern);
        Set<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int j=0;
        int l1=input.length();
        int l2=pattern.length();
        int left=0;
        int index=-1,maxLen=0;
        for(int i=0;i<l1;i++){
            char c1=input.charAt(i);
            char c2=pattern.charAt(j);
            if(c1==c2||!set.contains(c1)){
                if(j==l2-1){
                    if(i-left+1>maxLen){
                        System.out.println(i);
                        System.out.println(left);
                        maxLen=i-left+1;
                        index=left;
                    }
                }
            }
            else if(j+1<l2&&c1==pattern.charAt(j+1)){
                j++;
            }
            else{
                left=(c1=='a')?i:i+1;
                j=0;
            }


        }
        System.out.println(input.substring(index,index+maxLen));


    }


    // expand when we find a vowel char which  is matching to previous vowel char or the next char in the vowel sequence
    // expand if we found the non vowel char
    // store the starting index and curr length string in to find max len substring
    // if we found a vowel char that is not in the sequence then this window is invalid and shrinking begins
    // if there is a mismatch then all the processed string is invalid & need to start new processing from that index
    //
}
