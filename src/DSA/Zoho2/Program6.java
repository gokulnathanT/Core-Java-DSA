package DSA.Zoho2;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Program6 {
    public static void main(String[] args) {
        String input="a1b2c34c3b2cb3a1d";
        Map<Character,Integer> map=new LinkedHashMap<>();
//        for(int i=0;i<input.length();i++){
//            char ch=input.charAt(i);
//            if(ch>='a'&&ch<='z'){
//                if(!map.containsKey(ch)) {
//                    map.put(ch,i);
//                }
//            }
//            else{
//                if(map.containsKey(ch)){
//                    map.remove(ch);
//                }
//                map.put(ch,i);
//
//            }
//        }
        char charArray[]=input.toCharArray();
        Set<Character> set=new LinkedHashSet<>();
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(ch>='a'&&ch<='z'){
                if(!set.contains(ch)) {
                    set.add(ch);
                }
            }
            else{
                if(set.contains(ch)){
                    set.remove(ch);
                }
                set.add(ch);

            }
        }
        for(Character ch:set){
            System.out.print(" "+ch);
        }
    }
}
