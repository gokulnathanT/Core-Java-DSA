package DSA.Zoho2;

public class Program23 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<n;i++){
            for(int j=1;j<(n*2)-1;j++){
                if(j<=i){
                    System.out.print(" "+j+" ");
                }
                else if(j>=(n*2)-i-1){
                    System.out.print(" "+(n*2-j-1)+" ");
                }
                else{
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }
}
