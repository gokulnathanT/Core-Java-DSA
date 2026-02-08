package DSA.Zoho2;

public class Program5 {
    public static void main(String[] args) {
        int n=10;
        char c1='1';
        char c2='*';
        char ch=c1;
        int odd=n%2==1?1:0;
        int count=n%2==0?2:1;
        for(int i=1;i<=(n+1)/2;i++){
            for(int j=(n/2)-i;j>0-odd;j--){
                System.out.print("   ");
            }
            for(int j=0;j<count/2;j++){

                    if(j%2==0){
                        System.out.print(" 1 ");
                    }
                    else{
                        System.out.print(" * ");
                    }


            }
            for (int j=count/2;j<count;j++){
                if(j%2==1){
                    System.out.print(n%2==1?" * ":" 1 ");
                }
                else{
                    System.out.print(n%2==1?" 1 ":" * ");
                }
            }

            count+=2;
            System.out.println();
        }
        count-=2;
        for(int i=(n/2)-odd;i>=0;i--){
            for(int j=(n/2)-i;j>0;j--){
                System.out.print("   ");
            }
            for(int j=0;j<count/2;j++){

                if(j%2==0){
                    System.out.print(" 1 ");
                }
                else{
                    System.out.print(" * ");
                }


            }
            for (int j=count/2;j<count-(odd==1?2:0);j++){
                if(j%2==1){
                    System.out.print(n%2==1?" * ":" 1 ");
                }
                else{
                    System.out.print(n%2==1?" 1 ":" * ");
                }
            }
            count-=2;
            System.out.println();
        }


    }
}
