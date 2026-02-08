package DSA.Zoho2;

import java.util.Stack;

public class Program4 {
    public static void main(String[] args) {
        String str="(a(b(c){5}){2}d){4}";
        Stack<String> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        int i=0;
        while (i<str.length()){
            char ch=str.charAt(i);
            if(ch=='('){
                stack.push(sb.toString());
                sb.setLength(0);
            }
            else if(ch==')'){
                i+=2;
                int num=0;
                while(i<str.length()&&Character.isDigit(str.charAt(i))){
                    char n=str.charAt(i);
                    num*=10;
                    num+=n-'0';
                    i++;
                }

                StringBuilder stringmid=new StringBuilder();

                for(int j=0;j<num;j++){
                    stringmid.append(sb.toString());
                }
                sb=new StringBuilder(stack.pop()+stringmid);
            }
            else {
                sb.append(ch);
            }
            i++;
        }
        System.out.println(sb.toString());
    }
}
