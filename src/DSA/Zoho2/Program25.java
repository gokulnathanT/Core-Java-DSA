package DSA.Zoho2;

import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Map;

public class Program25 {
    public static void main(String[] args) {
        Map<Character,Integer> value=new HashMap<>();
        value.put('I',1);
        value.put('V',5);
        value.put('X',10);
        value.put('L',50);
        value.put('C',100);
        value.put('D',500);
        value.put('M',1000);
        String roman="III";
        int len= roman.length();
        int i=len-1;

        int num=0;
        while(i>=0){
            char ch=roman.charAt(i);
            if(ch=='I') {
                if (i != len - 1&&(roman.charAt(i+1)=='V'||roman.charAt(i+1)=='X')) {
                    num-=value.get(ch);
                }
                else{

                    num+=value.get(ch);
                    System.out.println("::");
                }
            }
            else if(ch=='C'){
                if(i!=len-1&&(roman.charAt(i+1)=='M'||roman.charAt(i+1)=='D')){
                    num-=value.get(ch);
                }
                else{
                    num+=value.get(ch);
                }
            }
            else if(ch=='X'){
                if(i!=len-1&&(roman.charAt(i+1)=='C'||roman.charAt(i+1)=='M')){
                    num-=value.get(ch);
                }
                else{
                    num+=value.get(ch);
                }
            }
           else{
               num+=value.get(ch);
            }
           i--;
        }
        System.out.println(num);
    }
}
