package DSA.Zoho2;

public class Program14 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            System.out.println();

            for(int j=0;j<2*n;j++){
                if(j>n-i-1&&j<n+i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
        }
        for(int i=n;i>=0;i--){
            for(int j=0;j<2*n;j++){
                if(j>n-i-1&&j<n+i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }



        int len=5;
        char ch='A';
        for(int i=0;i<len;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(ch+len+j-i-1)+" ");
            }
            System.out.println();
        }
    }
}
