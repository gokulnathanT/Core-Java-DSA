package DSA.Zoho2;

public class Program2 {
    public static void main(String[] args) {
        String str="GOKULNATHA";
        int index=0;
        int len=str.length();
        int n=len;
        if(n%2==0)n++;

        for(int i=0;i<n;i++){
            if(i==n/2){
                for(int j=0;j<len;j++){
                    if(j==len/2&&len%2==0){
                        System.out.print("  * ");
                    }
                    if(j==len/2) System.out.print(" ");
                    System.out.print(" "+str.charAt(j)+" ");
                    if(j==len/2&&len%2!=0) System.out.print(" ");
                }
                if(len%2==1)index++;
                System.out.println();
                continue;

            }
            for(int j=0;j<n;j++){

                if(i==j||j==n-i-1||j==n/2){
                    System.out.print(" "+str.charAt(index)+"  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            index++;
            System.out.println();
        }

    }
}
