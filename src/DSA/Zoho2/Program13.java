package DSA.Zoho2;

public class Program13 {
    public static void main(String[] args) {
        String str="ZohoCorporationTeam";
        int index=0;
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if(i==0||i==6){
                    System.out.print(" "+str.charAt(index++)+" ");
                }
                else if(j==7-i-1){
                    System.out.print(" "+str.charAt(index++)+" ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();

        }
    }
}
