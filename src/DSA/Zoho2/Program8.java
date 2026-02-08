package DSA.Zoho2;

public class Program8 {
    public static void main(String[] args) {

        String []arr={"Every morning i want to do exercise regularly","Every morning i want to do meditation without fail","I know i want to be happy"};

        String matchedString=findMatch(arr[1],arr[2]);
        String completeMatched=findMatch(matchedString,arr[0]);
        completeMatched=completeMatched.trim();
        int flen=completeMatched.length();
        for(int i=0;i<3;i++){
            int l1=0,l2=0;
            String str1=arr[i];
            for(int j=0;j<str1.length();j++){
                int flag=0;
                int index=j;
                for(int x=0;x<flen;x++){
                    if(completeMatched.charAt(x)!=str1.charAt(index)){
                        flag=1;

                        break;
                    }
                    index++;
                }
                if(flag==0){
                    StringBuilder sb=new StringBuilder();
                    for(int x=0;x<j;x++){
                        sb.append(str1.charAt(x));
                    }
                    for(int x=index;x<str1.length();x++){
                        sb.append(str1.charAt(x));
                    }
                    System.out.println("S"+i+" : "+sb.toString());
                }
            }
        }
        System.out.println("Removed fragment : "+ completeMatched);
    }
    public static String findMatch(String s1,String s2){
        int l1=s1.length();
        int l2=s2.length();
        int dp[]=new int[l2+1];
        int maxLen=0;
        int endInd=-1;
        for(int i=1;i<l1+1;i++){
            for(int j=l2;j>0;j--){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[j]=dp[j-1]+1;
                    if(dp[j]>maxLen){
                        maxLen=dp[j];
                        endInd=j;
                    }
                }
                else{
                    dp[j]=0;
                }
            }
        }

        return s2.substring(endInd-maxLen,endInd);
    }


}
