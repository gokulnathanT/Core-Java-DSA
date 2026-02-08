package DSA.Zoho2;

import static DSA.Zoho2.Program3.getString;

public class Program3 {


    public static void main(String[] args) {
        String str1="aaabbccdes";
        String str2="a+b+c+";
        int l1=str1.length();
        int l2=str2.length();
        Boolean visited[][]=new Boolean[l1+1][l2+1];
        for(int i=0;i<l1;i++){
            if(validatePattern(str1,str2,i,0,visited)){
                System.out.println("found");
                String string=getString(str1,str2,i);
                System.out.println(string);
                break;
            }
        }



    }
    public static boolean validatePattern(String str1,String str2,int i,int j,Boolean[][] visited ){
        if(visited[i][j]!=null){
            return visited[i][j];
        }
        if(j==str2.length()){
            return visited[i][j]=true;
        }

        boolean currentMatch=i<str1.length()&&(str1.charAt(i)==str2.charAt(j));
        boolean result;
        if(j+1<str2.length()){
            char ch=str2.charAt(j+1);
            if(ch=='*'){
                result=(currentMatch&&
                        validatePattern(str1,str2,i+1,j,visited)||
                                validatePattern(str1,str2,i,j+2,visited));
            }
            else if(ch=='+'){
                result=currentMatch&&(
                        validatePattern(str1,str2,i+1,j,visited)||
                        validatePattern(str1,str2,i+1,j+2,visited));
            }
            else {
                result = currentMatch && validatePattern(str1, str2, i + 1, j + 1, visited);
            }
        }
        else{
            result = currentMatch && validatePattern(str1, str2, i + 1, j + 1, visited);
        }
        return visited[i][j]=result;
    }

    public static String getString(String text,String pattern,int x){
        int index=x;
        int j=0;
        while(j<pattern.length()&&index<text.length()){
           char ch=pattern.charAt(j);

           if(j+1<pattern.length()&&(pattern.charAt(j+1)=='*'||pattern.charAt(j+1)=='+')){
               if(pattern.charAt(j+1)=='+'){
                   index++;
               }
               while(index<text.length()&&text.charAt(index)==ch){
                   index++;
               }
               j+=2; // jump after symbol
           }
           else{ // simple one to one match
               index++;
               j++;
           }
        }
        return text.substring(x,index);
    }
}

